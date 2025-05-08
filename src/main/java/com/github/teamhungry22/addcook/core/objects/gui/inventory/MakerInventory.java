package com.github.teamhungry22.addcook.core.objects.gui.inventory;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.ConfigManager;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.config.data.RecipeData;
import com.github.teamhungry22.addcook.core.line.LineManager;
import com.github.teamhungry22.addcook.core.objects.gui.GuiView;
import com.github.teamhungry22.addcook.core.objects.gui.InventoryData;
import com.github.teamhungry22.addcook.core.objects.gui.loader.*;
import com.github.teamhungry22.addcook.core.util.ItemUtils;
import com.github.teamhungry22.addcook.core.util.StringUtils;
import dev.lone.itemsadder.api.FontImages.FontImageWrapper;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public class MakerInventory extends InventoryData {
    public MakerInventory(AddCook plugin, String id) {
        super(StringUtils.getComponent("<white><font:addcook:gui>家喇</font>  <gold>레시피 이름: " + id));
        throw new AddCookNotFoundException();
    }

    public void openInventory(Player player) {
        throw new AddCookNotFoundException();
    }

    public void click(Player player, InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    public ItemStack getIcon(String itemID, String name, List<String> lore) {
        throw new AddCookNotFoundException();
    }

    public boolean isNoneIcon(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public int getFirstSlot() {
        throw new AddCookNotFoundException();
    }

    public String getOffset(int offset) {
        throw new AddCookNotFoundException();
    }

    public AddCook getPlugin() {
        throw new AddCookNotFoundException();
    }

    public GuiView getGuiView() {
        throw new AddCookNotFoundException();
    }

    public LineManager getLineManager() {
        throw new AddCookNotFoundException();
    }

    public Map<String, RecipeData> getRecipeMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, FurnitureData> getFurnitureMap() {
        throw new AddCookNotFoundException();
    }

    public ConfigManager getConfigManager() {
        throw new AddCookNotFoundException();
    }

    public String getMenuType() {
        throw new AddCookNotFoundException();
    }

    public void setMenuType(String menuType) {
        throw new AddCookNotFoundException();
    }

    public RecipeData getRecipeData() {
        throw new AddCookNotFoundException();
    }

    public MakerBaseLoader getBaseLoader() {
        throw new AddCookNotFoundException();
    }

    public MakerAnvilLoader getAnvilLoader() {
        throw new AddCookNotFoundException();
    }

    public MakerFurnitureLoader getFurnitureLoader() {
        throw new AddCookNotFoundException();
    }

    public MakerIconLoader getIconLoader() {
        throw new AddCookNotFoundException();
    }

    public MakerResultAnvilLoader getResultAnvilLoader() {
        throw new AddCookNotFoundException();
    }

    public MakerResultLoader getResultLoader() {
        throw new AddCookNotFoundException();
    }

    public MakerORItemLoader getOrItemLoader() {
        throw new AddCookNotFoundException();
    }
}
