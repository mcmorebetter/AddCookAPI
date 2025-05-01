package com.github.teamhungry22.addcook.core.listener;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamageListener implements Listener {
    public EntityDamageListener(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @EventHandler
    public void onEntityDamagedEvent(EntityDamageByEntityEvent event) {
        throw new AddCookNotFoundException();
    }

    // 3.6 이전 엔티티를 3.6 버전으로 교체하는 메서드
    private void beforeEntity(Player player, Entity entity) {
        throw new AddCookNotFoundException();
    }
}
