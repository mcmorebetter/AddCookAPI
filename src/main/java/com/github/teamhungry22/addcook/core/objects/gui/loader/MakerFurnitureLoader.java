package com.github.teamhungry22.addcook.core.objects.gui.loader;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.gui.inventory.MakerInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MakerFurnitureLoader {
    // 페이지 기능은 추가하지 않음 왜인지 안 쓸 것 같아서
    public MakerFurnitureLoader(MakerInventory makerInventory) {
        throw new AddCookNotFoundException();
    }

    public void click(Player player, InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    public void addFurniture(Player player, String furniture, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void removeFurniture(Player player, String furniture, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void load(Player player) {
        throw new AddCookNotFoundException();
    }

    public void setSelectFont() {
        throw new AddCookNotFoundException();
    }
}
