package com.github.teamhungry22.addcook.core.util;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import net.kyori.adventure.text.Component;

import java.util.List;

public class StringUtils {
    public static String getString(Component component) {
        throw new AddCookNotFoundException();
    }

    public static Component getComponent(String text) {
        throw new AddCookNotFoundException();
    }

    public static List<Component> getComponentList(List<String> textList) {
        throw new AddCookNotFoundException();
    }
}
