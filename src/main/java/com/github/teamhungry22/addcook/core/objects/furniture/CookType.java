package com.github.teamhungry22.addcook.core.objects.furniture;

import java.util.EnumSet;
import java.util.Map;
import java.util.stream.Collectors;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public enum CookType {
    TIME,
    STACK,
    CRAFT;

    private static final Map<String, CookType> map = EnumSet.allOf(CookType.class)
            .stream()
            .collect(Collectors.toMap(Enum::name, e -> e));

    public static boolean has(String value) {
        throw new AddCookNotFoundException();
    }

    public static CookType get(String value) {
        throw new AddCookNotFoundException();
    }
}
