package com.github.teamhungry22.addcook.core.config.data;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.item.RecipeBookItem;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class RecipeData {
    public RecipeData(String id, List<String> permissionList, ItemStack icon,
                      double time, int point, String color, List<String> furnitureList, List<String> resultList) {
        throw new AddCookNotFoundException();
    }

    public String getId() {
        throw new AddCookNotFoundException();
    }

    public List<String> getPermissionList() {
        throw new AddCookNotFoundException();
    }

    public ItemStack getIcon() {
        throw new AddCookNotFoundException();
    }

    public List<String> getFurnitureList() {
        throw new AddCookNotFoundException();
    }

    public Double getTime() {
        throw new AddCookNotFoundException();
    }

    public int getPoint() {
        throw new AddCookNotFoundException();
    }

    public String getColor() {
        throw new AddCookNotFoundException();
    }

    public RecipeBookItem getRecipeBook() {
        throw new AddCookNotFoundException();
    }

    public void setRecipeBook(RecipeBookItem recipeBook) {
        throw new AddCookNotFoundException();
    }

    public List<String> getResultList() {
        throw new AddCookNotFoundException();
    }

    public Map<Integer, List<String>> getStageMap() {
        throw new AddCookNotFoundException();
    }

    public void setStageMap(Integer index, List<String> value) {
        throw new AddCookNotFoundException();
    }

    public String toPermission() {
        throw new AddCookNotFoundException();
    }
}
