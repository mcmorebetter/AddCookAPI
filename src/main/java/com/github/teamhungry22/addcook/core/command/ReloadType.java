package com.github.teamhungry22.addcook.core.command;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public enum ReloadType {
    AUTO,
    FIRST,
    NORMAL,
    RECIPE_CREATE;

    public static boolean has(String value) {
        throw new AddCookNotFoundException();
    }

    public static ReloadType get(String value) {
        throw new AddCookNotFoundException();
    }
}
