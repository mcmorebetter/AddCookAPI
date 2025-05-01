package com.github.teamhungry22.addcook.core.objects.gui;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.*;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.core.objects.gui.GuiContainer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;

import java.util.HashMap;
import java.util.UUID;

public class GuiView {
    private final HashMap<UUID, GuiContainer> guiView = new HashMap<>();
    private final ProtocolManager protocolManager;
    private final AddCook plugin;

    public GuiView(AddCook plugin) {
        this.plugin = plugin;
        this.protocolManager = plugin.getProtocolManager();
        protocolManager.addPacketListener(getOpenWindowPacketListener());
        protocolManager.addPacketListener(getCloseWindowPacketListener());
    }

    private PacketListener getOpenWindowPacketListener() {
        return new PacketAdapter(plugin, ListenerPriority.HIGH, PacketType.Play.Server.OPEN_WINDOW) {
            @Override
            public void onPacketSending(PacketEvent event) {
                final UUID uuid = event.getPlayer().getUniqueId();

                final int windowId = event.getPacket().getIntegers().read(0);
                final Object containerType = event.getPacket().getStructures().readSafely(0);

                GuiContainer recipeContainer = new GuiContainer(windowId, containerType);
                guiView.put(uuid, recipeContainer);
            }
        };
    }

    private PacketListener getCloseWindowPacketListener() {
        return new PacketAdapter(plugin, ListenerPriority.HIGH, PacketType.Play.Client.CLOSE_WINDOW) {
            @Override
            public void onPacketReceiving(PacketEvent event) {
                final UUID uuid = event.getPlayer().getUniqueId();

                guiView.remove(uuid);
            }
        };
    }

    public void setPlayerInventoryTitle(Player player, Component text) {
        final InventoryType type = player.getOpenInventory().getType();
        if (type == InventoryType.CRAFTING || type == InventoryType.CREATIVE) return;

        GuiContainer container = guiView.get(player.getUniqueId());
        if (container == null) return;

        final int windowId = container.getWindowId();
        if (windowId == 0) return;

        final Object windowType = container.getContainerType();
        final String title = GsonComponentSerializer.gson().serialize(text);

        sendOpenScreenPacket(player, windowId, windowType, title);
        player.updateInventory();
    }


    private void sendOpenScreenPacket(Player player, int windowId, Object windowType, String title) {
        final WrappedChatComponent wrappedChatComponent = WrappedChatComponent.fromJson(title);

        PacketContainer openScreen = new PacketContainer(PacketType.Play.Server.OPEN_WINDOW);
        openScreen.getIntegers().write(0, windowId);
        openScreen.getStructures().write(0, (InternalStructure) windowType);
        openScreen.getChatComponents().write(0, wrappedChatComponent);

        protocolManager.sendServerPacket(player, openScreen);
    }
}