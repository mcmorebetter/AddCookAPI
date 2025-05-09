package com.github.teamhungry22.addcook.core.config;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.command.ReloadType;
import com.github.teamhungry22.addcook.core.config.data.*;
import com.github.teamhungry22.addcook.core.config.manager.*;
import com.github.teamhungry22.addcook.core.objects.item.MaterialItem;
import com.github.teamhungry22.addcook.core.objects.item.ToolItem;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;
import java.util.Map;

public class ConfigManager {
    public ConfigManager(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    public void firstLoad() {
        throw new AddCookNotFoundException();
    }

    public void reload(ReloadType reloadType) {
        throw new AddCookNotFoundException();
    }

    private void loadModelListSetting() {
        throw new AddCookNotFoundException();
    }

    private void loadListSetting(String path, List<String> targetList) {
        throw new AddCookNotFoundException();
    }

    private void clearData() {
        throw new AddCookNotFoundException();
    }

    private void createFiles() {
        throw new AddCookNotFoundException();
    }

    private void reloadMessage() {
        throw new AddCookNotFoundException();
    }

    public YamlConfigLoader getLoader() {
        throw new AddCookNotFoundException();
    }

    public YamlConfiguration getConfig() {
        throw new AddCookNotFoundException();
    }

    public YamlConfiguration getMessageConfig() {
        throw new AddCookNotFoundException();
    }

    public MessageConfigManager getMessageManager() {
        throw new AddCookNotFoundException();
    }

    public GuiConfigManager getGuiManager() {
        throw new AddCookNotFoundException();
    }

    public FailRecipeConfigManager getFailRecipeManager() {
        throw new AddCookNotFoundException();
    }

    public FurnitureConfigManager getFurnitureManager() {
        throw new AddCookNotFoundException();
    }

    public ToolConfigManager getToolManager() {
        throw new AddCookNotFoundException();
    }

    public MaterialConfigManager getMaterialManager() {
        throw new AddCookNotFoundException();
    }

    public ModelConfigManager getModelManager() {
        throw new AddCookNotFoundException();
    }

    public RecipeConfigManager getRecipeManager() {
        throw new AddCookNotFoundException();
    }

    public Map<String, FurnitureData> getFurnitureMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, ToolItem> getToolMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, MaterialItem> getMaterialMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, ModelData> getModelMap() {
        throw new AddCookNotFoundException();
    }

    public Map<Integer, List<ModelData>> getModelStageMap() {
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

    public Map<String, MessageData> getMessageMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, GuiData> getGuiMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, Object> getFailRecipeMap() {
        throw new AddCookNotFoundException();
    }

    public int getChunkTick() {
        throw new AddCookNotFoundException();
    }

    public String getDropType() {
        throw new AddCookNotFoundException();
    }

    public boolean isCookInteractEnabled() {
        throw new AddCookNotFoundException();
    }

    public boolean isFurnitureOnlyUseTool() {
        throw new AddCookNotFoundException();
    }

    public double getModelLoadTime() {
        throw new AddCookNotFoundException();
    }

    public List<String> getModelRandomList() {
        throw new AddCookNotFoundException();
    }

    public List<String> getBanItemList() {
        throw new AddCookNotFoundException();
    }

    public List<String> getBanBlockList() {
        throw new AddCookNotFoundException();
    }
}
