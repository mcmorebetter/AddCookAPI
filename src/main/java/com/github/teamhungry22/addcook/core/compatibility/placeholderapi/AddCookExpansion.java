package com.github.teamhungry22.addcook.core.compatibility.placeholderapi;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class AddCookExpansion extends PlaceholderExpansion {
    public AddCookExpansion(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @NotNull
    @Override
    public String getIdentifier() {
        throw new AddCookNotFoundException();
    }

    @NotNull
    @Override
    public String getAuthor() {
        throw new AddCookNotFoundException();
    }

    @NotNull
    @Override
    public String getVersion() {
        throw new AddCookNotFoundException();
    }

    @Override
    public String onRequest(OfflinePlayer player, String params) {
        throw new AddCookNotFoundException();
    }

    private String getCookTime(Entity entity, String type) {
        throw new AddCookNotFoundException();
    }
}