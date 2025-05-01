package com.github.teamhungry22.addcook.core.objects.furniture;

import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

public class FurnitureUtils {
    // 필수 조건 작동
    public static boolean executeRequirements(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, String type) {
        throw new AddCookNotFoundException();
    }

    // 이벤트 작동
    public static void executeEvents(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, String type) {
        throw new AddCookNotFoundException();
    }

    // 상호작용할 수 있는지 판단
    public static boolean canInteract(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, ActionManager am) {
        throw new AddCookNotFoundException();
    }

    // 재료가 맞는지 판단
    public static boolean match(Map<Integer, List<String>> materialMap, List<String> storageList, int storageSize) {
        throw new AddCookNotFoundException();
    }

    // 남은 쿨타임 계산
    public static double leftCooldown(long lastTime, double cooldown) {
        throw new AddCookNotFoundException();
    }
}
