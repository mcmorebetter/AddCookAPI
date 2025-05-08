package com.github.teamhungry22.addcook.core.objects.gui;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class InventoryData implements InventoryHolder {
    public InventoryData(Component component) {
        throw new AddCookNotFoundException();
    }

    public ItemStack getPageIcon(String type) {
        throw new AddCookNotFoundException();
    }

    public void addPage(int amount, int limit, boolean isForce) {
        throw new AddCookNotFoundException();
    }

    @NotNull
    public Inventory getInventory() {
        throw new AddCookNotFoundException();
    }

    public Component getComponent() {
        throw new AddCookNotFoundException();
    }

    public void setComponent(Component component) {
        throw new AddCookNotFoundException();
    }

    public Integer getPage() {
        throw new AddCookNotFoundException();
    }

    public void setPage(Integer page) {
        throw new AddCookNotFoundException();
    }

    public ItemStack BACK() {
        throw new AddCookNotFoundException();
    }

    public ItemStack OR_ITEM() {
        throw new AddCookNotFoundException();
    }

    public ItemStack UNKNOWN() {
        throw new AddCookNotFoundException();
    }

    public ItemStack CHANGE_TYPE() {
        throw new AddCookNotFoundException();
    }

    public ItemStack NEXT_PAGE() {
        throw new AddCookNotFoundException();
    }

    public ItemStack PREVIOUS_PAGE() {
        throw new AddCookNotFoundException();
    }
}
