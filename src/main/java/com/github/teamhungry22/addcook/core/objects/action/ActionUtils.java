package com.github.teamhungry22.addcook.core.objects.action;

import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.objects.item.UseItem;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class ActionUtils {
    // 효과 재생
    public static void useEffect(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, UseItem useItem, ActionManager am) {
        throw new AddCookNotFoundException();
    }

    // 이벤트 강제 재생
    public static void playEvent(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, String eventName) {
        throw new AddCookNotFoundException();
    }

    // 아이템 드롭 (STRING > ITEM)
    public static void dropItem(Player player, Location location, String line, String dropType) {
        throw new AddCookNotFoundException();
    }
    
    // 아이템 드롭
    public static void dropItem(Player player, Location location, ItemStack itemStack, String dropType) {
        throw new AddCookNotFoundException();
    }
    
    // 소리 재생 (STRING > SOUND)
    public static void playSound(Player player, Location location, String line) {
        throw new AddCookNotFoundException();
    }
}
