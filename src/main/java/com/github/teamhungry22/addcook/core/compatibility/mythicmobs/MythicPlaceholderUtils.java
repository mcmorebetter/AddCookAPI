package com.github.teamhungry22.addcook.core.compatibility.mythicmobs;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.entity.Entity;

public class MythicPlaceholderUtils {
    public static String getPDC(Entity entity, String value) {
        throw new AddCookNotFoundException();
    }

    public static String hasTag(Entity entity, String value) {
        throw new AddCookNotFoundException();
    }
}
