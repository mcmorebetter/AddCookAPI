package com.github.teamhungry22.addcook.core.listener.mythicmobs;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import io.lumine.mythic.bukkit.events.MythicReloadedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MMReloadListener implements Listener {
    public MMReloadListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onMythicMobsReload(MythicReloadedEvent event) {
        throw new AddCookNotFoundException();
    }

    private void loadPlaceholders() {
        throw new AddCookNotFoundException();
    }

    private void registerPlaceholders() {
        throw new AddCookNotFoundException();
    }
}
