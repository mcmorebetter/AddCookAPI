package com.github.teamhungry22.addcook.core.task;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.task.tasks.CookTask;
import org.bukkit.Chunk;

import java.util.List;

public class ChunkTask {
    public ChunkTask(AddCook plugin, Chunk chunk, long interval) {
        throw new AddCookNotFoundException();
    }

    public void addTask(ITask task) {
        throw new AddCookNotFoundException();
    }

    public void removeTask(ITask task) {
        throw new AddCookNotFoundException();
    }

    public List<CookTask> getCookTasks() {
        throw new AddCookNotFoundException();
    }
}


