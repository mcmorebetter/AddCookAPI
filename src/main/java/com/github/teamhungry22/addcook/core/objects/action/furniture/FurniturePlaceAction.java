package com.github.teamhungry22.addcook.core.objects.action.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

/**
 * 요리 가구를 설치하는 Action 클래스
 */
public class FurniturePlaceAction implements Action {
    public FurniturePlaceAction(ActionManager am, Player player, Entity entity, Location location, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    private boolean canPlace() {
        throw new AddCookNotFoundException();
    }

    public FurnitureEntity getFurnitureEntity() {
        throw new AddCookNotFoundException();
    }
}
