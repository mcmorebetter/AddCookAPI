package com.github.teamhungry22.addcook;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.github.teamhungry22.addcook.api.AddCookAPI;
import com.github.teamhungry22.addcook.core.command.CommandManager;
import com.github.teamhungry22.addcook.core.command.RecipeViewerCommand;
import com.github.teamhungry22.addcook.core.compatibility.placeholderapi.AddCookExpansion;
import com.github.teamhungry22.addcook.core.config.ConfigManager;
import com.github.teamhungry22.addcook.core.line.LineManager;
import com.github.teamhungry22.addcook.core.listener.EntityDamageListener;
import com.github.teamhungry22.addcook.core.listener.PlayerInteractListener;
import com.github.teamhungry22.addcook.core.listener.PlayerInventoryListener;
import com.github.teamhungry22.addcook.core.listener.addcook.FurnitureDamagedListener;
import com.github.teamhungry22.addcook.core.listener.addcook.FurnitureInteractListener;
import com.github.teamhungry22.addcook.core.listener.addcook.ReloadListener;
import com.github.teamhungry22.addcook.core.listener.itemsadder.ItemsAdderLoadListener;
import com.github.teamhungry22.addcook.core.listener.mythicmobs.MMInteractListener;
import com.github.teamhungry22.addcook.core.listener.mythicmobs.MMReloadListener;
import com.github.teamhungry22.addcook.core.listener.nexo.NexoLoadListener;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.entity.EntityManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureManager;
import com.github.teamhungry22.addcook.core.objects.gui.GuiManager;
import com.github.teamhungry22.addcook.core.objects.gui.GuiView;
import com.github.teamhungry22.addcook.core.objects.item.ItemManager;
import de.tr7zw.changeme.nbtapi.NBT;
import net.luckperms.api.LuckPerms;
import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class AddCook extends JavaPlugin {
    private static AddCook plugin;
    private AddCookAPI api;
    private PluginManager pluginManager;
    private ProtocolManager protocolManager;
    private GuiView guiView;
    private ConfigManager configManager;
    private FurnitureManager furnitureManager;
    private EntityManager entityManager;
    private ItemManager itemManager;
    private LineManager lineManager;
    private ActionManager actionManager;
    private GuiManager guiManager;
    private LuckPerms luckPerms;

    private String customItemPlugin;
    private boolean loadData;
    private boolean autoLoad;

    @Override
    public void onLoad() {
        plugin = this;
        protocolManager = ProtocolLibrary.getProtocolManager();
        pluginManager = Bukkit.getPluginManager();
        customItemPlugin = loadCustomItemPlugin();
        guiView = new GuiView(plugin);
    }

    @Override
    public void onEnable() {
        if (!NBT.preloadApi()) {
            stopPlugin("NBT-API 초기화 실패! - 플러그인 비활성화");
            return;
        }

        if (customItemPlugin == null) {
            stopPlugin("커스텀 아이템 플러그인을 찾을 수 없습니다! - 플러그인 비활성화");
            return;
        }

        if (!loadLuckPerms()) {
            stopPlugin("LuckPerms 플러그인을 찾을 수 없습니다! - 플러그인 비활성화");
            return;
        }

        Metrics metrics = new Metrics(this, 23628);
        loadManagers();
        loadCommands();
        loadEvents();
    }

    @Override
    public void onDisable() {}

    private void loadManagers() {
        configManager = new ConfigManager(this);
        configManager.firstLoad();
        setLoadData(false);
        setAutoLoad(false);

        itemManager = new ItemManager(this);
        lineManager = new LineManager(this);
        entityManager = new EntityManager(this);
        furnitureManager = new FurnitureManager(this);
        actionManager = new ActionManager(this);
        guiManager = new GuiManager(this);
        api = new AddCookAPI(this);

        if (pluginManager.getPlugin("placeholderapi") != null) new AddCookExpansion(this).register();
    }

    private void loadCommands() {
        plugin.getCommand("addcook").setExecutor(new CommandManager(this));
        plugin.getCommand("recipe").setExecutor(new RecipeViewerCommand(this));
    }

    private void loadEvents() {
        pluginManager.registerEvents(new ReloadListener(this), this);
        pluginManager.registerEvents(new FurnitureDamagedListener(this), this);
        pluginManager.registerEvents(new FurnitureInteractListener(this), this);

        if (customItemPlugin.equalsIgnoreCase("ia")) {
            pluginManager.registerEvents(new ItemsAdderLoadListener(this), this);

        } else if (customItemPlugin.equalsIgnoreCase("nexo")) {
            pluginManager.registerEvents(new NexoLoadListener(this), this);
        }

        pluginManager.registerEvents(new MMReloadListener(this), this);
        pluginManager.registerEvents(new MMInteractListener(this), this);
        pluginManager.registerEvents(new EntityDamageListener(this), this);
        pluginManager.registerEvents(new PlayerInteractListener(this), this);
        pluginManager.registerEvents(new PlayerInventoryListener(), this);
    }

    private boolean loadLuckPerms() {
        RegisteredServiceProvider<LuckPerms> provider = getServer().getServicesManager().getRegistration(LuckPerms.class);
        if (provider != null) {
            luckPerms = provider.getProvider();
            return true;
        }
        return false;
    }

    private String loadCustomItemPlugin() {
        if (pluginManager.getPlugin("itemsadder") != null) {
            return "ia";

        } else if (pluginManager.getPlugin("nexo") != null) {
            return "nexo";
        }
        return null;
    }

    private void stopPlugin(String text) {
        getLogger().warning(text);
        Bukkit.getPluginManager().disablePlugin(this);
    }

    public static AddCook getInstance() {
        return plugin;
    }

    public AddCookAPI getApi() {
        return api;
    }

    public PluginManager getPluginManager() {
        return pluginManager;
    }

    public ProtocolManager getProtocolManager() {
        return protocolManager;
    }

    public GuiView getGuiView() {
        return guiView;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    public ItemManager getItemManager() {
        return itemManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public FurnitureManager getFurnitureManager() {
        return furnitureManager;
    }

    public LineManager getLineManager() {
        return lineManager;
    }

    public ActionManager getActionManager() {
        return actionManager;
    }

    public GuiManager getGuiManager() {
        return guiManager;
    }

    public LuckPerms getLuckPerms() {
        return luckPerms;
    }

    public String getCustomItemPlugin() {
        return customItemPlugin;
    }

    public boolean isLoadData() {
        return loadData;
    }

    public void setLoadData(boolean loadData) {
        this.loadData = loadData;
    }

    public boolean isAutoLoad() {
        return autoLoad;
    }

    public void setAutoLoad(boolean autoLoad) {
        this.autoLoad = autoLoad;
    }
}
