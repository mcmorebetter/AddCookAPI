package com.github.teamhungry22.addcook.core.objects.gui.loader;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.line.Line;
import com.github.teamhungry22.addcook.core.objects.gui.inventory.MakerInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class MakerORItemLoader {
    // 페이지 기능은 추가하지 않음 왜인지 안 쓸 것 같아서
    public MakerORItemLoader(MakerInventory makerInventory) {
        throw new AddCookNotFoundException();
    }

    public void click(Player player, InventoryClickEvent event, String menuType) {
        throw new AddCookNotFoundException();
    }

    public void addOrItem(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void removeOrItem(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void addOrResult(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void removeOrResult(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void load(Player player, int orItemIndex, String menuType) {
        throw new AddCookNotFoundException();
    }

    private void loadOrItem() {
        throw new AddCookNotFoundException();
    }

    private void loadOrResult(Player player) {
        throw new AddCookNotFoundException();
    }

    public ItemStack convertItem(Line line) {
        throw new AddCookNotFoundException();
    }

    public List<String> getLore(Line line) {
        throw new AddCookNotFoundException();
    }

    public int getOrItemIndex() {
        throw new AddCookNotFoundException();
    }
}
