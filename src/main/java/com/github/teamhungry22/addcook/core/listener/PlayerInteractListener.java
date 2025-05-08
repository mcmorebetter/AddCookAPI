package com.github.teamhungry22.addcook.core.listener;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.item.AddCookItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {
    public PlayerInteractListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onPlayerItemInteractEvent(PlayerInteractEvent event) {
        throw new AddCookNotFoundException();
    }

    private void furniturePlaceEvent(Player player, PlayerInteractEvent event, AddCookItem addCookItem) {
        throw new AddCookNotFoundException();
    }

    private void recipeBookUseEvent(Player player, AddCookItem addCookItem) {
        throw new AddCookNotFoundException();
    }
}