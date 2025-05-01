package com.github.teamhungry22.addcook.core.objects.action.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.config.data.RecipeData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.CookResult;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Player;

public class StackEndAction implements Action {
    public StackEndAction(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    private void stackEnd(RecipeData recipeData, CookResult cookResult) {
        throw new AddCookNotFoundException();
    }

    private void stackReset(RecipeData recipeData, CookResult cookResult) {
        throw new AddCookNotFoundException();
    }
}
