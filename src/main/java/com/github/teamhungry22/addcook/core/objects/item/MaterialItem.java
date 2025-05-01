package com.github.teamhungry22.addcook.core.objects.item;

import org.bukkit.inventory.ItemStack;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

import java.util.List;

public class MaterialItem extends UseItem {
    private final String sound;
    private final int amount;
    private final boolean returnEnabled;
    private final String returnItem;
    private final boolean cancelMaterial;

    public MaterialItem(ItemStack itemStack, String type, String id, List<String> permissionList,
                        String sound, int amount, boolean returnEnabled, String returnItem, boolean cancelMaterial,
                        boolean infinite, int point, String playEvent, String changeColorBone, String changeColor) {

        super(itemStack, type, id, permissionList, infinite, point, playEvent, changeColorBone, changeColor);
        throw new AddCookNotFoundException();
    }

    public String getSound() {
        throw new AddCookNotFoundException();
    }

    public int getAmount() {
        throw new AddCookNotFoundException();
    }

    public boolean isReturnEnabled() {
        throw new AddCookNotFoundException();
    }

    public String getReturnItem() {
        throw new AddCookNotFoundException();
    }

    public boolean isCancelMaterial() {
        throw new AddCookNotFoundException();
    }
}