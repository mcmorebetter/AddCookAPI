package com.github.teamhungry22.addcook.core.objects.action.item;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Player;

/**
 * 뒤집개 도구의 Action 클래스
 */
public class TurnerAction implements Action {
    public TurnerAction(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    private boolean isTurner() {
        throw new AddCookNotFoundException();
    }
}
