package com.github.teamhungry22.addcook.core.config.manager;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.GuiData;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class GuiConfigManager {
    public GuiConfigManager() {}

    public void load(YamlConfiguration config) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public Map<String, GuiData> getGuiMap() {
        throw new AddCookNotFoundException();
    }
}
