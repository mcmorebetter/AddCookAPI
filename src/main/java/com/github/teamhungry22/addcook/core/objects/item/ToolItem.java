package com.github.teamhungry22.addcook.core.objects.item;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class ToolItem extends UseItem {
    public ToolItem(ItemStack itemStack, String type, String id, List<String> permissionList,
                    String toolType, int durabilityAmount,
                    boolean infinite, int point, String playEvent, String changeColorBone, String changeColor) {

        super(itemStack, type, id, permissionList, infinite, point, playEvent, changeColorBone, changeColor);
        throw new AddCookNotFoundException();
    }

    public String getToolType() {
        throw new AddCookNotFoundException();
    }

    public int getDurabilityAmount() {
        throw new AddCookNotFoundException();
    }
}
