package com.github.teamhungry22.addcook.core.util;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.core.config.data.MessageData;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class MessageUtils {
    private static final AddCook plugin = AddCook.getInstance();

    public static void actionbar(Player player, String text) {
        throw new AddCookNotFoundException();
    }

    public static void actionbar(Player player, String[] arr) {
        throw new AddCookNotFoundException();
    }

    public static void title(Player player, String mainTitle, String subTitle, int fadeIn, int stay, int fadeOut) {
        throw new AddCookNotFoundException();
    }

    public static void logInfo(String text) {
        throw new AddCookNotFoundException();
    }

    public static void logWarning(String text) {
        throw new AddCookNotFoundException();
    }

    public static void send(CommandSender sender, String text) {
        throw new AddCookNotFoundException();
    }

    public static void send(CommandSender sender, String[] arr) {
        throw new AddCookNotFoundException();
    }

    public static void send(Player player, MessageData messageData, String text, String replace, boolean runPAPI) {
        throw new AddCookNotFoundException();
    }

    public static void send(Player player, MessageData messageData) {
        throw new AddCookNotFoundException();
    }

    public static void send(Player player, FurnitureEntity furnitureEntity, MessageData messageData) {
        throw new AddCookNotFoundException();
    }

    public static void send(Player player, FurnitureEntity furnitureEntity, MessageData messageData, String text, String replace, boolean runPAPI) {
        throw new AddCookNotFoundException();
    }
}

//
//# {cook_cooldown} = 메세지를 발생시킨 가구의 요리 쿨타임
//# {cook_left_time} = 메세지를 발생시킨 가구의 요리에 남은 시간
//# {cook_left_percent} = 메세지를 발생시킨 가구의 요리에 완성도
//