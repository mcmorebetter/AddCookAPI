package com.github.teamhungry22.addcook.core.objects.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public enum CookResult {
    COMPLETE,
    FAIL;

    public static boolean has(String value) {
        throw new AddCookNotFoundException();
    }

    public static CookResult get(String value) {
        throw new AddCookNotFoundException();
    }
}
