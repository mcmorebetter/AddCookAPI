package com.github.teamhungry22.addcook.core.config.manager;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcook.core.objects.item.MaterialItem;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class MaterialConfigManager {
    public MaterialConfigManager(AddCook plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCookNotFoundException();
    }

    public void load(String path) {
        throw new AddCookNotFoundException();
    }

    private void loadMaterialConfig(YamlConfiguration yaml, String filePath) {
        throw new AddCookNotFoundException();
    }

    private void setMaterialItem(ConfigurationSection section, String id, String itemPath) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public Map<String, MaterialItem> getMaterialMap() {
        throw new AddCookNotFoundException();
    }
}
