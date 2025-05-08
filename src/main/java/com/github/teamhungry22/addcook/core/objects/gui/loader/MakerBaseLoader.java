package com.github.teamhungry22.addcook.core.objects.gui.loader;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.gui.inventory.MakerInventory;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class MakerBaseLoader {
    public MakerBaseLoader(MakerInventory makerInventory) {
        throw new AddCookNotFoundException();
    }

    public void load(Player player) {
        throw new AddCookNotFoundException();
    }

    public void addMaterial(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void removeMaterial(Player player, int slot) {
        throw new AddCookNotFoundException();
    }

    public void iconResult() {
        throw new AddCookNotFoundException();
    }

    private void checkList(List<String> lore) {
        throw new AddCookNotFoundException();
    }

    public String iconPath(Inventory inventory) {
        throw new AddCookNotFoundException();
    }

    public String iconTime(Inventory inventory) {
        throw new AddCookNotFoundException();
    }

    public String iconPoint(Inventory inventory) {
        throw new AddCookNotFoundException();
    }

    public String iconColor(Inventory inventory) {
        throw new AddCookNotFoundException();
    }

    public void iconFurnitureList(Inventory inventory) {
        throw new AddCookNotFoundException();
    }

    public ItemStack iconIcon(Inventory inventory) {
        throw new AddCookNotFoundException();
    }

    public ItemStack iconRecipeBook(Inventory inventory) {
        throw new AddCookNotFoundException();
    }

    private void loadMaterial(Inventory inventory) {
        throw new AddCookNotFoundException();
    }
}
