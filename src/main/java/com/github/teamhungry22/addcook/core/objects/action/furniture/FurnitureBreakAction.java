package com.github.teamhungry22.addcook.core.objects.action.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Player;

import java.util.List;

public class FurnitureBreakAction implements Action {
    public FurnitureBreakAction(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, boolean isForce) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    private boolean isPart() {
        throw new AddCookNotFoundException();
    }

    private boolean isPartValid(List<String> parts) {
        throw new AddCookNotFoundException();
    }
}
