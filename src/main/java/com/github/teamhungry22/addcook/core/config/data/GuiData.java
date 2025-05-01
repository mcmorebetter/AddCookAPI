package com.github.teamhungry22.addcook.core.config.data;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public class GuiData {
    public GuiData(boolean enabled, List<String> permissionList, boolean itemConvert, Map<String, ItemStack> iconMap, Map<String, String> soundMap) {
        throw new AddCookNotFoundException();
    }

    public boolean isEnabled() {
        throw new AddCookNotFoundException();
    }

    public List<String> getPermissionList() {
        throw new AddCookNotFoundException();
    }

    public boolean isItemConvert() {
        throw new AddCookNotFoundException();
    }

    public Map<String, ItemStack> getIconMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, String> getSoundMap() {
        throw new AddCookNotFoundException();
    }
}
