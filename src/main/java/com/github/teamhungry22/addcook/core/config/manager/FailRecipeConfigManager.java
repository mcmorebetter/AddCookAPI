package com.github.teamhungry22.addcook.core.config.manager;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class FailRecipeConfigManager {
    public FailRecipeConfigManager() {}

    public void load(YamlConfiguration config) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public Map<String, Object> getFailRecipeMap() {
        throw new AddCookNotFoundException();
    }
}
