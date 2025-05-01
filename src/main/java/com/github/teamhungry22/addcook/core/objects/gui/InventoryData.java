package com.github.teamhungry22.addcook.core.objects.gui;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.core.config.data.GuiData;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;


public class InventoryData implements InventoryHolder {
    protected Inventory inventory;
    protected Component component;
    protected Integer page;

    protected GuiData guiData;
    protected ItemStack CHANGE_TYPE;
    protected ItemStack PREVIOUS_PAGE;
    protected ItemStack NEXT_PAGE;
    protected ItemStack UNKNOWN;
    protected ItemStack BACK;
    protected ItemStack OR_ITEM;

    public InventoryData(Component component) {
        throw new AddCookNotFoundException();
    }

    public void setPage(int amount, int limit, boolean isForce) {
        throw new AddCookNotFoundException();
    }

    public ItemStack getPageIcon(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    @NotNull
    public Inventory getInventory() {
        throw new AddCookNotFoundException();
    }
}
