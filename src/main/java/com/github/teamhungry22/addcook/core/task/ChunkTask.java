package com.github.teamhungry22.addcook.core.task;

import org.bukkit.Chunk;
import java.util.*;
import org.bukkit.scheduler.BukkitRunnable;
import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class ChunkTask {
    private final AddCook plugin;
    private final Chunk chunk;
    private final long interval;
    private final BukkitRunnable scheduler;
    private final List<ITask> tasks = new ArrayList<>();

    public ChunkTask(AddCook plugin, Chunk chunk, long interval) {
        throw new AddCookNotFoundException();
    }

    public void addTask(ITask task) {
        throw new AddCookNotFoundException();
    }
}


