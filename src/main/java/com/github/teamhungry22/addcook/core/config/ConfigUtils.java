package com.github.teamhungry22.addcook.core.config;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.List;

public class ConfigUtils {
    public static List<String> getOnlyStringList(ConfigurationSection section, Object id) {
        throw new AddCookNotFoundException();
    }

    public static List<String> getOnlyStringList(YamlConfiguration yaml, Object id) {
        throw new AddCookNotFoundException();
    }

    public static void replaceKey(File file, String replaceText) {
        throw new AddCookNotFoundException();
    }
}
