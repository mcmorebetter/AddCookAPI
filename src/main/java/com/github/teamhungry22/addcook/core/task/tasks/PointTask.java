package com.github.teamhungry22.addcook.core.task.tasks;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.task.ITask;

public class PointTask implements ITask {
    public PointTask(ActionManager am, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    public void update(int value) {
        throw new AddCookNotFoundException();
    }

    public void update(String text) {
        throw new AddCookNotFoundException();
    }

    @Override
    public boolean tick() {
        throw new AddCookNotFoundException();
    }

    private void remove() {
        throw new AddCookNotFoundException();
    }
}