package com.github.teamhungry22.addcook.core.listener;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class PlayerInventoryListener implements Listener {

    @EventHandler
    public void onPlayerInventoryClick(InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    private boolean isPlayerInventory(Inventory inv, Player player) {
        throw new AddCookNotFoundException();
    }

    private void cancel(InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }
}
