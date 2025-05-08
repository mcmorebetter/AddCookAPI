package com.github.teamhungry22.addcook.core.objects.gui.loader;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.gui.inventory.MakerInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MakerIconLoader {
    public MakerIconLoader(MakerInventory makerInventory) {
        throw new AddCookNotFoundException();
    }

    public void click(Player player, InventoryClickEvent event, String menuType) {
        throw new AddCookNotFoundException();
    }

    public void addIcon(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void removeIcon(Player player) {
        throw new AddCookNotFoundException();
    }

    public void addRecipeBook(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void removeRecipeBook(Player player) {
        throw new AddCookNotFoundException();
    }

    public void load(Player player, String menuType) {
        throw new AddCookNotFoundException();
    }
}
