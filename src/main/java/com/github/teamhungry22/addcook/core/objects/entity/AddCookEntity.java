package com.github.teamhungry22.addcook.core.objects.entity;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import io.lumine.mythic.core.mobs.ActiveMob;
import org.bukkit.entity.Entity;

import java.util.UUID;

public class AddCookEntity {
    protected Entity entity;
    protected UUID uuid;
    protected ActiveMob activeMob;
    protected String ownerUUID;
    protected String entityType;

    public AddCookEntity(Entity entity, String ownerUUID, String entityType) {
        throw new AddCookNotFoundException();
    }

    public Entity getEntity() {
        throw new AddCookNotFoundException();
    }

    public void setEntity(Entity entity) {
        throw new AddCookNotFoundException();
    }

    public UUID getUniqueId() {
        throw new AddCookNotFoundException();
    }

    public void setUniqueId(UUID uuid) {
        throw new AddCookNotFoundException();
    }

    public ActiveMob getActiveMob() {
        throw new AddCookNotFoundException();
    }

    public void setActiveMob(ActiveMob activeMob) {
        throw new AddCookNotFoundException();
    }

    public String getOwnerUUID() {
        throw new AddCookNotFoundException();
    }

    public void setOwnerUUID(String ownerUUID) {
        throw new AddCookNotFoundException();
    }
}
