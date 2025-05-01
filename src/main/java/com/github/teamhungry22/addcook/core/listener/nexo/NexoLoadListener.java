package com.github.teamhungry22.addcook.core.listener.nexo;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.nexomc.nexo.api.events.NexoItemsLoadedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class NexoLoadListener implements Listener {
    public NexoLoadListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onNexoItemLoadEvent(NexoItemsLoadedEvent event) {
        throw new AddCookNotFoundException();
    }
}