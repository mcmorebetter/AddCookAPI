package com.github.teamhungry22.addcook.core.objects.action.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Player;

/**
 * 레시피 북을 여는 Action 클래스
 */
public class RecipeBookOpenAction implements Action {
    public RecipeBookOpenAction(ActionManager am, Player player, FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }
}
