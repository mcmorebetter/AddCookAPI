package com.github.teamhungry22.addcook.core.objects.gui;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.core.config.ConfigManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Entity;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class GuiManager {
    private static final Map<UUID, InventoryData> invMap = new HashMap<>();
    private final ConfigManager configManager;
    private final GuiView guiView;

    public GuiManager(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    public Optional<InventoryData> inv(Object obj) {
        throw new AddCookNotFoundException();
    }

    public Optional<InventoryData> getInv(UUID uuid) {
        throw new AddCookNotFoundException();
    }

    public void registerInv(UUID uuid, InventoryData inv) {
        throw new AddCookNotFoundException();
    }

    public void unregisterInv(UUID uuid) {
        invMap.remove(uuid);
        throw new AddCookNotFoundException();
        // TODO 만약 누군가 GUI를 열고 있다면 강제로 닫히게
    }

    public static Map<UUID, InventoryData> getInvMap() {
        throw new AddCookNotFoundException();
    }
}
