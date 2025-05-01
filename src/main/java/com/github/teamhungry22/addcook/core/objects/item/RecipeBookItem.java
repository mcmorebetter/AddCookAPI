package com.github.teamhungry22.addcook.core.objects.item;

import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

import java.util.List;

public class RecipeBookItem extends AddCookItem {
    private Component chat;

    public RecipeBookItem(ItemStack itemStack, String type, String id, List<String> permissionList, String name, List<String> lore, String chatDisplay) {
        super(itemStack, type, id, permissionList);
        throw new AddCookNotFoundException();
    }

    public Component getChat() {
        throw new AddCookNotFoundException();
    }

    public String toPermission() {
        throw new AddCookNotFoundException();
    }
}
