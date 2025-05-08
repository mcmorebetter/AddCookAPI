package com.github.teamhungry22.addcook.core.objects.entity;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class EntityManager {
    public EntityManager(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    public Optional<AddCookEntity> entity(Object obj) {
        throw new AddCookNotFoundException();
    }

    public Optional<AddCookEntity> loadEntity(Entity entity) {
        throw new AddCookNotFoundException();
    }

    public Optional<AddCookEntity> getEntity(UUID uuid) {
        throw new AddCookNotFoundException();
    }

    public Set<AddCookEntity> getEntityFromChunk(Location location) {
        throw new AddCookNotFoundException();
    }

    public <T extends AddCookEntity> Set<T> getEntityFromChunk(Location location, Class<T> type) {
        throw new AddCookNotFoundException();
    }

    public void registerEntity(AddCookEntity entity) {
        throw new AddCookNotFoundException();
    }

    public void unregisterEntity(AddCookEntity entity) {
        throw new AddCookNotFoundException();
    }

    public Map<UUID, AddCookEntity> getEntityMap() {
        throw new AddCookNotFoundException();
    }
}
