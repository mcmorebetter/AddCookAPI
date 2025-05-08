package com.github.teamhungry22.addcook.core.objects.item;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class RecipeBookItem extends AddCookItem {
    // 레시피 제작 GUI에서 기존 레시피를 수정할 때
    // 아이템이 바닐라 아이템이면 addcook:recipe:아이디로 변환되는 문제가 있기에 rawItemStack을 따로 저장
    public RecipeBookItem(ItemStack itemStack, String type, String id, List<String> permissionList,
                          String name, List<String> lore, String chatDisplay, ItemStack rawItemStack) {
        super(itemStack, type, id, permissionList);
        throw new AddCookNotFoundException();
    }

    public ItemStack getRawItemStack() {
        throw new AddCookNotFoundException();
    }

    public Component getChat() {
        throw new AddCookNotFoundException();
    }

    public String toPermission() {
        throw new AddCookNotFoundException();
    }
}
