package com.github.teamhungry22.addcook.core.objects.action.item;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * 바닐라 재료를 가구에 추가하는 Action 클래스
 */
public class MaterialVanillaAction implements Action {
    public MaterialVanillaAction(ActionManager am, Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    private boolean isBanItem(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    private void addMaterial(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }
}
