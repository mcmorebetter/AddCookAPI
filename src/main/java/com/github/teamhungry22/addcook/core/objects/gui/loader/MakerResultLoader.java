package com.github.teamhungry22.addcook.core.objects.gui.loader;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.line.Line;
import com.github.teamhungry22.addcook.core.objects.gui.inventory.MakerInventory;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class MakerResultLoader {
    // 페이지 기능은 추가하지 않음 왜인지 안 쓸 것 같아서
    public MakerResultLoader(MakerInventory makerInventory) {
        throw new AddCookNotFoundException();
    }

    public void click(Player player, InventoryClickEvent event) {
        throw new AddCookNotFoundException();
    }

    public void create(Player player) {
        throw new AddCookNotFoundException();
    }

    public void addResult(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void removeResult(Player player, int slot) {
        throw new AddCookNotFoundException();
    }

    public void load(Player player) {
        throw new AddCookNotFoundException();
    }

    private void loadResult(Player player) {
        throw new AddCookNotFoundException();
    }

    public void setOrItemFont() {
        throw new AddCookNotFoundException();
    }

    private Component getComponent(int row) {
        throw new AddCookNotFoundException();
    }

    public ItemStack convertItem(Line line) {
        throw new AddCookNotFoundException();
    }

    public ItemStack convertListItem(List<Line> lineList) {
        throw new AddCookNotFoundException();
    }

    public List<String> getLore(Line line) {
        throw new AddCookNotFoundException();
    }

    public List<String> getLore2(Line line) {
        throw new AddCookNotFoundException();
    }

    public ItemStack getOtherItem(String name, List<String> lore) {
        throw new AddCookNotFoundException();
    }
}
