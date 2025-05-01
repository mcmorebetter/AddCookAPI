package com.github.teamhungry22.addcook.core.config.manager;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class FurnitureConfigManager {
    public FurnitureConfigManager(AddCook plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCookNotFoundException();
    }

    public void load(String path) {
        throw new AddCookNotFoundException();
    }

    private void loadFurnitureConfig(YamlConfiguration yaml, String filePath) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public Map<String, FurnitureData> getFurnitureMap() {
        throw new AddCookNotFoundException();
    }
}
