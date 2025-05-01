package com.github.teamhungry22.addcook.core.config.manager;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcook.core.config.data.ModelData;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;
import java.util.Map;

public class ModelConfigManager {
    public ModelConfigManager(AddCook plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCookNotFoundException();
    }

    public void load(String path) {
        throw new AddCookNotFoundException();
    }

    private void loadModelsFromYaml(YamlConfiguration yaml, String filePath) {
        throw new AddCookNotFoundException();
    }

    private void setModelData(ConfigurationSection section, String id) {
        throw new AddCookNotFoundException();
    }

    private int getMaterialStage(Object obj, ConfigurationSection section) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public Map<String, ModelData> getModelMap() {
        throw new AddCookNotFoundException();
    }

    public Map<Integer, List<ModelData>> getModelStageMap() {
        throw new AddCookNotFoundException();
    }
}
