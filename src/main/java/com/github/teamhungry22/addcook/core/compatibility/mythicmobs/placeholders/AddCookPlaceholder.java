package com.github.teamhungry22.addcook.core.compatibility.mythicmobs.placeholders;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import io.lumine.mythic.core.skills.placeholders.PlaceholderExecutor;
import io.lumine.mythic.core.skills.placeholders.PlaceholderMeta;
import org.bukkit.entity.Entity;

public class AddCookPlaceholder implements MythicPlaceholder {
    public AddCookPlaceholder(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @Override
    public void register(PlaceholderExecutor manager) {
        throw new AddCookNotFoundException();
    }

    private void registerBase(PlaceholderExecutor manager) {
        throw new AddCookNotFoundException();
    }

    private void registerFurniture(PlaceholderExecutor manager) {
        throw new AddCookNotFoundException();
    }

    private Entity getBaseEntity(PlaceholderMeta meta) {
        throw new AddCookNotFoundException();
    }

    private String getValue(String string, Entity entity) {
        throw new AddCookNotFoundException();
    }
}
