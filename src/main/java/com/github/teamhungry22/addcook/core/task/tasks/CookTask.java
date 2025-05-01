package com.github.teamhungry22.addcook.core.task.tasks;

import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.config.data.RecipeData;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.CookResult;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.task.ITask;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class CookTask implements ITask {
    private final ActionManager am;
    private final Player player;
    private final FurnitureEntity furnitureEntity;
    private final FurnitureData furnitureData;
    private final RecipeData recipeData;
    private final CookResult cookResult;
    private final TextDisplay textDisplay;
    private final int delay;
    private final String type;
    private final java.awt.Color resultColor;
    private final double totalTick;
    private final String[] bars;
    private int tick = 0;
    private final long endTime;

    public CookTask(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData,
                    RecipeData recipeData, CookResult cookResult, long interval, int delay, String type) {
        throw new AddCookNotFoundException();
    }

    @Override
    public boolean tick() {
        throw new AddCookNotFoundException();
    }

    private String getColor(double progress) {
        throw new AddCookNotFoundException();
    }

    private java.awt.Color getColor() {
        throw new AddCookNotFoundException();
    }

    private String[] getBars(String type) {
        throw new AddCookNotFoundException();
    }
}