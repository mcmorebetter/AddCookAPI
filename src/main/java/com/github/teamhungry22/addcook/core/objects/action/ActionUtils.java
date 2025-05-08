package com.github.teamhungry22.addcook.core.objects.action;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.objects.item.UseItem;
import org.bukkit.entity.Player;

public class ActionUtils {
    // 효과 재생
    public static void useEffect(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, UseItem useItem, ActionManager am) {
        throw new AddCookNotFoundException();
    }

    // 이벤트 강제 재생
    public static void playEvent(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, String eventName) {
        throw new AddCookNotFoundException();
    }
}
