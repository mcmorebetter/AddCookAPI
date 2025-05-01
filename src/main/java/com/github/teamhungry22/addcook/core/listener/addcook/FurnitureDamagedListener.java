package com.github.teamhungry22.addcook.core.listener.addcook;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.api.event.FurnitureDamagedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FurnitureDamagedListener implements Listener {
    public FurnitureDamagedListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onFurnitureDamagedEvent(FurnitureDamagedEvent event) {
        throw new AddCookNotFoundException();
    }
}
