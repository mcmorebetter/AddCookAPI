package com.github.teamhungry22.addcook.core.task;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.task.tasks.CookTask;
import org.bukkit.Chunk;

import java.util.List;

public class ChunkTaskManager {
    public static synchronized ChunkTask getOrCreateManager(AddCook plugin, Chunk chunk, long interval) {
        throw new AddCookNotFoundException();
    }

    public static synchronized void removeManager(Chunk chunk) {
        throw new AddCookNotFoundException();
    }

    public static List<CookTask> getCookTasksInChunk(Chunk chunk) {
        throw new AddCookNotFoundException();
    }
}