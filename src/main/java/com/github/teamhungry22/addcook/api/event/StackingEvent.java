package com.github.teamhungry22.addcook.api.event;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StackingEvent extends Event implements Cancellable {
    public StackingEvent(Player player, FurnitureEntity furnitureEntity, int stack) {
        throw new AddCookNotFoundException();
    }

    public Player getPlayer() {
        throw new AddCookNotFoundException();
    }

    public Entity getEntity() {
        throw new AddCookNotFoundException();
    }

    public Location getLocation() {
        throw new AddCookNotFoundException();
    }

    public String getFurniture() {
        throw new AddCookNotFoundException();
    }

    public FurnitureEntity getFurnitureEntity() {
        throw new AddCookNotFoundException();
    }

    public int getStack() {
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