package com.github.teamhungry22.addcook.core.objects.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public enum CookType {
    TIME,
    STACK,
    CRAFT;

    public static boolean has(String value) {
        throw new AddCookNotFoundException();
    }

    public static CookType get(String value) {
        throw new AddCookNotFoundException();
    }
}
