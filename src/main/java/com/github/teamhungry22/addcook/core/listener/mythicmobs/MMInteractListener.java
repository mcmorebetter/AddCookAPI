package com.github.teamhungry22.addcook.core.listener.mythicmobs;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import io.lumine.mythic.bukkit.events.MythicMobInteractEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MMInteractListener implements Listener {
    public MMInteractListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onMMInteractEvent(MythicMobInteractEvent event) {
        throw new AddCookNotFoundException();
    }
}
