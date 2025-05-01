package com.github.teamhungry22.addcook.core.objects.action.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Player;

/**
 * 요리 가구 위에 가구를 설치하는 Action 클래스
 */
public class PartAddAction implements Action {
    public PartAddAction(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, String placeFurniture) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    // furnitureEntity = 파트를 추가하려는 부모 가구
    // partFurnitureEntity = 부모 가구에 추가하는 파트
    public void addPart(FurnitureData.Part selectPart) {
        throw new AddCookNotFoundException();
    }
}
