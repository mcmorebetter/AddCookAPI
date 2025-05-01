package com.github.teamhungry22.addcook.core.util;

import de.tr7zw.changeme.nbtapi.iface.ReadWriteNBT;
import de.tr7zw.changeme.nbtapi.iface.ReadableNBT;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import java.util.function.Consumer;
import java.util.function.Function;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class NBTUtils {
    public static boolean hasNBT(ItemStack itemStack, String key) {
        throw new AddCookNotFoundException();
    }

    public static <T> T getNBT(ItemStack itemStack, String key, String type) {
        throw new AddCookNotFoundException();
    }

    public static void setNBT(ItemStack itemStack, String key, Object value, String type) {
        throw new AddCookNotFoundException();
    }

    public static boolean hasPDC(ItemStack itemStack, String key) {
        throw new AddCookNotFoundException();
    }

    public static <T> T getPDC(ItemStack itemStack, String key, String type) {
        throw new AddCookNotFoundException();
    }

    public static void setPDC(ItemStack itemStack, String key, Object value, String type) {
        throw new AddCookNotFoundException();
    }

    public static boolean hasPDC(Entity entity, String key) {
        throw new AddCookNotFoundException();
    }

    public static <T> T getPDC(Entity entity, String key, String type) {
        throw new AddCookNotFoundException();
    }

    public static void setPDC(Entity entity, String key, Object value, String type) {
        throw new AddCookNotFoundException();
    }

    public static <T> T getItemPDC(ItemStack itemStack, Function<ReadableNBT, T> getter) {
        throw new AddCookNotFoundException();
    }

    private static void modifyItemPDC(ItemStack itemStack, Consumer<ReadWriteNBT> consumer) {
        throw new AddCookNotFoundException();
    }

    private static <T> T getValue(ReadableNBT nbt, String key, String type) {
        throw new AddCookNotFoundException();
    }

    private static void setCompound(ReadWriteNBT nbt, String key, Object value, String type) {
        throw new AddCookNotFoundException();
    }

    private static void setValue(ReadWriteNBT nbt, String key, Object value, String type) {
        throw new AddCookNotFoundException();
    }

    public static <T> T loadPDC(Entity entity, String key, T defValue, String type) {
        throw new AddCookNotFoundException();
    }

    public static <T> T loadOrCreatePDC(Entity entity, String key, T defValue, String type) {
        throw new AddCookNotFoundException();
    }
}
