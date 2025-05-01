package com.github.teamhungry22.addcook.core.compatibility.nexo;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.nexomc.nexo.items.ItemBuilder;
import org.bukkit.inventory.ItemStack;

public class NexoUtils {
    public static ItemBuilder getItemBuilder(String itemID) {
        throw new AddCookNotFoundException();
    }

    public static ItemBuilder getItemBuilder(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static String getID(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static ItemStack getNexoItem(String itemID) {
        throw new AddCookNotFoundException();
    }

    public static boolean isNexoItem(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }
}
