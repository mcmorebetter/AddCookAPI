package com.github.teamhungry22.addcook.api;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.core.objects.entity.AddCookEntity;
import com.github.teamhungry22.addcook.core.objects.item.AddCookItem;
import org.bukkit.Location;

import java.util.Optional;

public class AddCookAPI {
    public AddCookAPI(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    public boolean isAddCookItem(Object obj) {
        throw new AddCookNotFoundException();
    }

    public Optional<AddCookItem> getAddCookItem(Object obj) {
        throw new AddCookNotFoundException();
    }

    public boolean isAddCookEntity(Object obj) {
        throw new AddCookNotFoundException();
    }

    public Optional<AddCookEntity> getAddCookEntity(Object obj) {
        throw new AddCookNotFoundException();
    }

    public int getAddCookEntityFromChunk(Location location) {
        throw new AddCookNotFoundException();
    }

    public int getAddCookFurnitureFromChunk(Location location, String furniture) {
        throw new AddCookNotFoundException();
    }
}
