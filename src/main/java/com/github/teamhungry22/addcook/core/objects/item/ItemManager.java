package com.github.teamhungry22.addcook.core.objects.item;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

public class ItemManager {
    public ItemManager(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    public Optional<AddCookItem> item(Object obj) {
        throw new AddCookNotFoundException();
    }

    public Optional<AddCookItem> loadItem(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public Optional<AddCookItem> getItem(String itemName) {
        throw new AddCookNotFoundException();
    }

    private AddCookItem getAddCookItem(String type, String id) {
        throw new AddCookNotFoundException();
    }
}
