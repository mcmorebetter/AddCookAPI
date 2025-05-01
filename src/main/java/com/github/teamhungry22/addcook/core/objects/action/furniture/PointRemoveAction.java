package com.github.teamhungry22.addcook.core.objects.action.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Player;

/**
 * 요리 가구에 포인트를 제거하는 Action 클래스
 */
public class PointRemoveAction implements Action {
    public PointRemoveAction(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, int point) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    private void removePoint() {
        throw new AddCookNotFoundException();
    }
}
