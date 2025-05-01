package com.github.teamhungry22.addcook.core.compatibility.itemsadder;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import dev.lone.itemsadder.api.CustomStack;
import org.bukkit.inventory.ItemStack;

public class IAUtils {
    public static CustomStack getCustomStack(String namespaceID) {
        throw new AddCookNotFoundException();
    }

    public static CustomStack getCustomStack(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static ItemStack getItemsAdderItem(String namespaceID) {
        throw new AddCookNotFoundException();
    }
}
