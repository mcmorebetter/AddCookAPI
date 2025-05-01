package com.github.teamhungry22.addcook.core.util;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.inventory.ItemStack;

public class TagUtils {
    public static boolean has(ItemStack itemStack, String key) {
        throw new AddCookNotFoundException();
    }

    public static Object get(ItemStack itemStack, String key, String type) {
        throw new AddCookNotFoundException();
    }

    public static void set(ItemStack itemStack, String key, Object value, String type) {
        throw new AddCookNotFoundException();
    }

    public static String loadStringTag(ItemStack itemStack, String key, String def) {
        throw new AddCookNotFoundException();
    }

    public static Integer loadIntTag(ItemStack itemStack, String key, int def) {
        throw new AddCookNotFoundException();
    }
}
