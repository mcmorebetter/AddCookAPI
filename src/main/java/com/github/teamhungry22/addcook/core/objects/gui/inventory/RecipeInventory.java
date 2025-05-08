package com.github.teamhungry22.addcook.core.objects.gui.inventory;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.RecipeData;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.objects.gui.InventoryData;
import com.github.teamhungry22.addcook.core.util.StringUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.List;

public class RecipeInventory extends InventoryData {
    public RecipeInventory(AddCook plugin, FurnitureEntity furnitureEntity, String furniture) {
        super(StringUtils.getComponent("<font:addcook:gui><white>家裸</font>"));
        throw new AddCookNotFoundException();
    }

    public void openInventory(Player player) {
        throw new AddCookNotFoundException();
    }

    public void click(Player player, InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    private void toggleType(Player player, int limit) {
        throw new AddCookNotFoundException();
    }

    private void changePage(Player player, String sound, int amount, int limit, boolean isForce) {
        throw new AddCookNotFoundException();
    }

    private void loadStageDefault(Player player, InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    private void load(Player player, String menuType, boolean isStage) {
        throw new AddCookNotFoundException();
    }

    private void loadMap(Player player, int startIndex) {
        throw new AddCookNotFoundException();
    }

    private void loadList(Player player, int startIndex) {
        throw new AddCookNotFoundException();
    }

    private void loadStage(Player player) {
        throw new AddCookNotFoundException();
    }

    private void loadORItem(Player player, int orItemIndex) {
        throw new AddCookNotFoundException();
    }

    private void loadStorage(Player player) {
        throw new AddCookNotFoundException();
    }

    private void giveRecipeBook(Player player) {
        throw new AddCookNotFoundException();
    }

    private int getLimit() {
        throw new AddCookNotFoundException();
    }

    private void getRecipeBook(Player player) {
        throw new AddCookNotFoundException();
    }

    private void setIcons() {
        throw new AddCookNotFoundException();
    }

    private void changeInventoryTitle(Player player, boolean isAmountFont) {
        throw new AddCookNotFoundException();
    }

    private Component getRecipeSizeFont(Player player, List<RecipeData> recipeDataList) {
        throw new AddCookNotFoundException();
    }

    private String getSizeFont(int size1, int size2) {
        throw new AddCookNotFoundException();
    }

    private String insertOffset(int size) {
        throw new AddCookNotFoundException();
    }

    private String getOffset(int offset) {
        throw new AddCookNotFoundException();
    }
}