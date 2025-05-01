package com.github.teamhungry22.addcook.core.listener.addcook;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.api.event.ACookReloadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ReloadListener implements Listener {
    public ReloadListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onAddCookReloadEvent(ACookReloadEvent event) {
        throw new AddCookNotFoundException();
    }
}
