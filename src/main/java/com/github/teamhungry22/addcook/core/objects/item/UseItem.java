package com.github.teamhungry22.addcook.core.objects.item;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class UseItem extends AddCookItem {
    private final boolean infinite;
    private final int point;
    private final String playEvent;
    private final String changeColorBone;
    private final String changeColor;

    public UseItem(ItemStack itemStack, String type, String id, List<String> permissionList,
                   boolean infinite, int point, String playEvent, String changeColorBone, String changeColor) {
        super(itemStack, type, id, permissionList);
        throw new AddCookNotFoundException();
    }

    public boolean isInfinite() {
        throw new AddCookNotFoundException();
    }

    public int getPoint() {
        throw new AddCookNotFoundException();
    }

    public String getPlayEvent() {
        throw new AddCookNotFoundException();
    }

    public String getChangeColorBone() {
        throw new AddCookNotFoundException();
    }

    public String getChangeColor() {
        throw new AddCookNotFoundException();
    }
}
