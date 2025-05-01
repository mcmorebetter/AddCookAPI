package com.github.teamhungry22.addcook.core.util;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.core.objects.item.ItemManager;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;
import java.util.List;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class ItemUtils {
    private static final ItemManager itemManager = AddCook.getInstance().getItemManager();

    public static boolean isTool(ItemStack item) {
        throw new AddCookNotFoundException();
    }

    public static ItemStack getCustomItem(String itemName) {
        throw new AddCookNotFoundException();
    }

    public static String getCustomItemType(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static String getCustomItemId(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static String getCustomItemName(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    private static ItemStack getVanillaItem(String name) {
        throw new AddCookNotFoundException();
    }

    public static ItemStack getCustomItem(String itemName, String name, List<String> lore) {
        throw new AddCookNotFoundException();
    }

    public static ItemStack getCustomItem(ItemStack itemStack, String name, List<String> lore) {
        throw new AddCookNotFoundException();
    }

    public static ItemStack getCustomItem(ItemStack itemStack, List<String> lore) {
        throw new AddCookNotFoundException();
    }

    private static ItemStack getMythicItem(String itemName) {
        throw new AddCookNotFoundException();
    }

    private static ItemStack getMMOItemsItem(String itemName) {
        throw new AddCookNotFoundException();
    }

    private static ItemStack setItemMeta(ItemStack itemStack, Component name, List<Component> lore) {
        throw new AddCookNotFoundException();
    }
}