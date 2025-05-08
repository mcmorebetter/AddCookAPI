package com.github.teamhungry22.addcook.core.config.manager;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcook.core.config.data.RecipeData;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;
import java.util.Map;

public class RecipeConfigManager {
    public RecipeConfigManager(AddCook plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCookNotFoundException();
    }

    public void load(String path) {
        throw new AddCookNotFoundException();
    }

    private void loadRecipesFromYaml(YamlConfiguration yaml, String filePath, String fileName) {
        throw new AddCookNotFoundException();
    }

    private void setRecipeData(ConfigurationSection section, String id, String itemPath, String fileName) {
        throw new AddCookNotFoundException();
    }

    private int getMaterialStage(Object obj, ConfigurationSection section) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public Map<String, RecipeData> getRecipeMap() {
        throw new AddCookNotFoundException();
    }

    public Map<Integer, List<RecipeData>> getRecipeStageMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, List<RecipeData>> getRecipeFurnitureMap() {
        throw new AddCookNotFoundException();
    }
}
