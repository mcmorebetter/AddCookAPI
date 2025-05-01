package com.github.teamhungry22.addcook.core.task;

import com.github.teamhungry22.addcook.AddCook;
import org.bukkit.Chunk;
import java.util.*;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class ChunkTaskManager {
    private static final Map<Chunk, ChunkTask> managers = new HashMap<>();

    public static synchronized ChunkTask getOrCreateManager(AddCook plugin, Chunk chunk, long interval) {
        throw new AddCookNotFoundException();
    }

    public static synchronized void removeManager(Chunk chunk) {
        throw new AddCookNotFoundException();
    }
}