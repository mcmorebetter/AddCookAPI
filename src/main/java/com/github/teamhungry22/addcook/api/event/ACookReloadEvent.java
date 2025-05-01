package com.github.teamhungry22.addcook.api.event;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.command.ReloadType;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ACookReloadEvent extends Event implements Cancellable {
    public ACookReloadEvent(ReloadType reloadType) {
        throw new AddCookNotFoundException();
    }

    public ReloadType getReloadType() {
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