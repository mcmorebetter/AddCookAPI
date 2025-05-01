package com.github.teamhungry22.addcook.core.listener.itemsadder;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ItemsAdderLoadListener implements Listener {
    public ItemsAdderLoadListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onItemsAdderLoadEvent(ItemsAdderLoadDataEvent event) {
        throw new AddCookNotFoundException();
    }
}
