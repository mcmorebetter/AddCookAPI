package com.github.teamhungry22.addcook.api.event;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.item.AddCookItem;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class RecipeUseEvent extends Event implements Cancellable {
    public RecipeUseEvent(Player player, AddCookItem addCookItem) {
        throw new AddCookNotFoundException();
    }

    public Player getPlayer() {
        throw new AddCookNotFoundException();
    }

    public AddCookItem getAddCookItem() {
        throw new AddCookNotFoundException();
    }

    public String getRecipeId() {
        throw new AddCookNotFoundException();
    }

    public ItemStack getItemStack() {
        throw new AddCookNotFoundException();
    }

    @Override
    public boolean isCancelled() {
        throw new AddCookNotFoundException();
    }

    @Override
    public void setCancelled(boolean cancel) {
        throw new AddCookNotFoundException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new AddCookNotFoundException();
    }

    public static HandlerList getHandlerList() {
        throw new AddCookNotFoundException();
    }
}
