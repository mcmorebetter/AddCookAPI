package com.github.teamhungry22.addcook.core.objects.action.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.objects.item.ToolItem;
import org.bukkit.entity.Player;

public class StackStartAction implements Action {
    public StackStartAction(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, ToolItem toolItem) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    public void stackStart() {
        throw new AddCookNotFoundException();
    }

    public void stacking() {
        throw new AddCookNotFoundException();
    }

    public void cut(String eventType) {
        throw new AddCookNotFoundException();
    }
}
