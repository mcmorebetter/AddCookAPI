package com.github.teamhungry22.addcook.core.util;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class MathUtils {
    public static Double parsedDouble(String value, Double def) {
        throw new AddCookNotFoundException();
    }

    public static Integer getRangeToInt(String range, String splitKey, Integer def) {
        throw new AddCookNotFoundException();
    }

    public static Double getRangeToDouble(String range, String splitKey, Double def) {
        throw new AddCookNotFoundException();
    }

    public static Float getRangeToFloat(String range, String splitKey, Float def) {
        throw new AddCookNotFoundException();
    }

    public static Integer getRandomInt(Integer min, Integer max) {
        throw new AddCookNotFoundException();
    }

    public static Integer getRandomInt(Integer integer) {
        throw new AddCookNotFoundException();
    }

    public static Double getRandomDouble(Double min, Double max) {
        throw new AddCookNotFoundException();
    }

    public static Float getRandomFloat(Float min, Float max) {
        throw new AddCookNotFoundException();
    }

    public static boolean getChance(double chance) {
        throw new AddCookNotFoundException();
    }

    public static Integer getIndexWeight(List<Double> weights) {
        throw new AddCookNotFoundException();
    }

    private static <T extends Number> T parseRange(String range, String splitKey, Function<String, T> parser, BiFunction<T, T, T> randomizer, T def) {
        throw new AddCookNotFoundException();
    }
}
