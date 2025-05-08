package com.github.teamhungry22.addcook.core.objects.gui.inventory;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.RecipeData;
import com.github.teamhungry22.addcook.core.objects.gui.InventoryData;
import com.github.teamhungry22.addcook.core.util.StringUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Map;
import java.util.function.Function;

public class ItemListInventory extends InventoryData {
    public ItemListInventory(AddCook plugin) {
        super(StringUtils.getComponent("<font:addcook:gui><white>家螺</font>"));
        throw new AddCookNotFoundException();
    }

    public void click(Player player, InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    public void load(String itemType) {
        throw new AddCookNotFoundException();
    }

    private <T> void loadList(Map<String, T> map, Function<T, ItemStack> itemFunc) {
        throw new AddCookNotFoundException();
    }

    private void loadRecipe(Map<String, RecipeData> map, int startIndex) {
        throw new AddCookNotFoundException();
    }

    public void giveItem(Player player, InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    public void giveRecipeBook(Player player, InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    private int getSize(String type) {
        throw new AddCookNotFoundException();
    }

    private void setIcons() {
        throw new AddCookNotFoundException();
    }

    private ItemStack getIcon(String name, String type) {
        throw new AddCookNotFoundException();
    }
}
