package com.github.teamhungry22.addcook.core.objects.furniture;

import java.util.EnumSet;
import java.util.Map;
import java.util.stream.Collectors;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public enum CookResult {
    COMPLETE,
    FAIL;

    private static final Map<String, CookResult> map = EnumSet.allOf(CookResult.class)
            .stream()
            .collect(Collectors.toMap(Enum::name, e -> e));

    public static boolean has(String value) {
        throw new AddCookNotFoundException();
    }

    public static CookResult get(String value) {
        throw new AddCookNotFoundException();
    }
}
