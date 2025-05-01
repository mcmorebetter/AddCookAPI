package com.github.teamhungry22.addcook.core.objects.item;

import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

import java.util.List;

public class AddCookItem {
    protected List<String> permission;
    protected ItemStack itemStack;
    protected String type;
    protected String id;
    protected Component displayName;
    protected List<Component> lore;
    protected int customModelData;

    public AddCookItem(ItemStack itemStack, String type, String id, List<String> permissionList) {
        throw new AddCookNotFoundException();
    }

    public List<String> getPermission() {
        throw new AddCookNotFoundException();
    }

    public ItemStack getItemStack() {
        throw new AddCookNotFoundException();
    }

    public String getType() {
        throw new AddCookNotFoundException();
    }

    public String getId() {
        throw new AddCookNotFoundException();
    }

    public Component getDisplayName() {
        throw new AddCookNotFoundException();
    }

    public void setDisplayName(Component displayName) {
        throw new AddCookNotFoundException();
    }

    public List<Component> getLore() {
        throw new AddCookNotFoundException();
    }

    public void setLore(List<Component> lore) {
        throw new AddCookNotFoundException();
    }

    public int getCustomModelData() {
        throw new AddCookNotFoundException();
    }

    public String toStringId() {
        throw new AddCookNotFoundException();
    }
}
