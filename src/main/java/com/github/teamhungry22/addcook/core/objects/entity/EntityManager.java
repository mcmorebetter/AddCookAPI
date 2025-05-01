package com.github.teamhungry22.addcook.core.objects.entity;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.core.config.ConfigManager;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

import java.util.*;

public class EntityManager {
    private final ConfigManager configManager;
    private static final Map<UUID, AddCookEntity> entityMap = new HashMap<>();

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
