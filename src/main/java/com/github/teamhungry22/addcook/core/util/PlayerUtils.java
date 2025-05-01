package com.github.teamhungry22.addcook.core.util;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.AddCook;
import net.luckperms.api.LuckPerms;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PlayerUtils {
    private static final LuckPerms luckPerms = AddCook.getInstance().getLuckPerms();

    public static void updatePlayerInventory(Player player) {
        throw new AddCookNotFoundException();
    }

    public static void updatePlayerInventory(Player player, ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static void updatePlayerInventory(Player player, ItemStack itemStack, int amount) {
        throw new AddCookNotFoundException();
    }

    public static void updateItemDurability(Player player, int amount) {
        throw new AddCookNotFoundException();
    }

    public static boolean hasPermission(Player player, String permission) {
        throw new AddCookNotFoundException();
    }

    private static boolean hasPermissionMeta(Player player, String meta) {
        throw new AddCookNotFoundException();
    }

    public static boolean hasPermission(Player player, List<String> permissionList) {
        throw new AddCookNotFoundException();
    }

    public static void addPermission(Player player, String permission) {
        throw new AddCookNotFoundException();
    }

    public static void removePermission(Player player, String permission) {
        throw new AddCookNotFoundException();
    }

    public static float getDirection(Player player, boolean isOpposite) {
        throw new AddCookNotFoundException();
    }
}
