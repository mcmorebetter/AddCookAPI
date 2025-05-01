package com.github.teamhungry22.addcook.core.compatibility.placeholderapi;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Player;

public class AddCookPAPI {
    public static String replacePlaceholder(Player player, FurnitureEntity furnitureEntity, String text) {
        throw new AddCookNotFoundException();
    }

    public static String getPlayerName(String text, String replace, Player player) {
        throw new AddCookNotFoundException();
    }

    public static String getPlayerUUID(String text, String replace, Player player) {
        throw new AddCookNotFoundException();
    }

    public static String getFurnitureName(String text, String replace, FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }

    public static String getFurnitureUUID(String text, String replace, FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }

    public static String getMaterial(String text, String replace, String type, FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }

    public static String getPart(String text, String replace, String type, FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }

    public static String getPoint(String text, String replace, String type, FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }

    public static String getStack(String text, String replace, String type, FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }
}