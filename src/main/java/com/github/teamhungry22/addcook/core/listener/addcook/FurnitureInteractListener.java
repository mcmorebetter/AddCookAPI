package com.github.teamhungry22.addcook.core.listener.addcook;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.api.event.FurnitureInteractEvent;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.objects.item.AddCookItem;
import com.github.teamhungry22.addcook.core.objects.item.ToolItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FurnitureInteractListener implements Listener {
    public FurnitureInteractListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onFurnitureInteractEvent(FurnitureInteractEvent event) {
        throw new AddCookNotFoundException();
    }

    private void useAddCookItem(AddCookItem addCookItem, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    private void useVanillaItem(String itemId, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    private void useToolItem(Player player, FurnitureEntity furnitureEntity, ToolItem toolItem, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }
}
