package com.github.teamhungry22.addcook.core.config;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.Map;

public class YamlConfigLoader {
    public YamlConfigLoader(File folder, AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    public YamlConfiguration loadYaml(String path, boolean fromResource) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public File getFolder() {
        throw new AddCookNotFoundException();
    }

    public Map<String, File> getFileMap() {
        throw new AddCookNotFoundException();
    }
}
