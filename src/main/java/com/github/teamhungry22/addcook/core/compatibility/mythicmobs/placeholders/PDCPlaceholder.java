package com.github.teamhungry22.addcook.core.compatibility.mythicmobs.placeholders;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import io.lumine.mythic.core.skills.placeholders.PlaceholderExecutor;

public class PDCPlaceholder implements MythicPlaceholder {
    public void register(PlaceholderExecutor placeholderManager) {
        throw new AddCookNotFoundException();
    }
}
