package com.github.teamhungry22.addcook.core.objects.gui.loader;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.gui.inventory.MakerInventory;
import org.bukkit.entity.Player;

import java.util.List;

public class MakerAnvilLoader {
    public MakerAnvilLoader(MakerInventory makerInventory) {
        throw new AddCookNotFoundException();
    }

    public void load(Player player, String type) {
        throw new AddCookNotFoundException();
    }

    private String getCurrentValue(String type) {
        throw new AddCookNotFoundException();
    }

    private void applyValue(String type, String input) {
        throw new AddCookNotFoundException();
    }

    private List<String> getLore(String type, String current) {
        throw new AddCookNotFoundException();
    }
}
