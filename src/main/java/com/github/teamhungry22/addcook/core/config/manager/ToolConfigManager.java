package com.github.teamhungry22.addcook.core.config.manager;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcook.core.objects.item.ToolItem;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class ToolConfigManager {
    public ToolConfigManager(AddCook plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCookNotFoundException();
    }

    public void load(String path) {
        throw new AddCookNotFoundException();
    }

    private void loadToolConfig(YamlConfiguration yaml, String filePath) {
        throw new AddCookNotFoundException();
    }

    private void setToolItem(ConfigurationSection section, String id, String itemPath) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public Map<String, ToolItem> getToolMap() {
        throw new AddCookNotFoundException();
    }
}
