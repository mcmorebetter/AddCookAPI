package com.github.teamhungry22.addcook.core.objects.action.item;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.objects.item.MaterialItem;
import org.bukkit.entity.Player;

/**
 * AddCook 재료를 가구에 추가하는 Action 클래스
 */
public class MaterialAddCookAction implements Action {
    public MaterialAddCookAction(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, MaterialItem materialItem) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }
}
