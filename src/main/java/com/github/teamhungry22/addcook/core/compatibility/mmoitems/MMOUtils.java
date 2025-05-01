package com.github.teamhungry22.addcook.core.compatibility.mmoitems;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.inventory.ItemStack;

public class MMOUtils {
    public static String getType(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static String getID(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static String getNamespaceID(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static ItemStack getMMOItemsItem(String type, String id) {
        throw new AddCookNotFoundException();
    }
}
