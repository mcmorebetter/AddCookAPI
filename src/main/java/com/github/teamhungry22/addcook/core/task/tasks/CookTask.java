package com.github.teamhungry22.addcook.core.task.tasks;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.config.data.RecipeData;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.CookResult;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.task.ITask;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;

public class CookTask implements ITask {
    public CookTask(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData,
                    RecipeData recipeData, CookResult cookResult, long interval, int delay, String type) {
        throw new AddCookNotFoundException();
    }

    @Override
    public boolean tick() {
        throw new AddCookNotFoundException();
    }

    private java.awt.Color getColor() {
        throw new AddCookNotFoundException();
    }

    private String[] getBars(String type) {
        throw new AddCookNotFoundException();
    }

    public void forceEnd() {
        throw new AddCookNotFoundException();
    }

    public double getLeftTime() {
        throw new AddCookNotFoundException();
    }

    public FurnitureEntity getFurnitureEntity() {
        throw new AddCookNotFoundException();
    }

    public FurnitureData getFurnitureData() {
        throw new AddCookNotFoundException();
    }

    public RecipeData getRecipeData() {
        throw new AddCookNotFoundException();
    }

    public CookResult getCookResult() {
        throw new AddCookNotFoundException();
    }

    public TextDisplay getTextDisplay() {
        throw new AddCookNotFoundException();
    }

    public boolean isEnded() {
        throw new AddCookNotFoundException();
    }
}