package com.github.teamhungry22.addcook.core.objects.furniture;

import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.objects.entity.AddCookEntity;
import com.github.teamhungry22.addcook.core.util.ItemUtils;
import com.github.teamhungry22.addcook.core.util.NBTUtils;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class FurnitureEntity extends AddCookEntity {
    private final String furniture;
    private final String parentUUID;
    private final String modelId;

    private int point;
    private int stack;
    private final List<String> storage;
    private final List<String> parts;

    public FurnitureEntity(Entity entity, String ownerUUID, String parentUUID, FurnitureData furnitureData) {
        super(entity, ownerUUID, "furniture");

        throw new AddCookNotFoundException();
    }

    public void addPoint(int amount, int limit) {
        throw new AddCookNotFoundException();
    }

    public void addStack(int amount, int limit) {
        throw new AddCookNotFoundException();
    }

    public void clearStack() {
        throw new AddCookNotFoundException();
    }

    public void addStorage(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void removeStorage() {
        throw new AddCookNotFoundException();
    }

    public void clearStorage() {
        throw new AddCookNotFoundException();
    }

    public void addPart(String entityUUID) {
        throw new AddCookNotFoundException();
    }

    public void removePart() {
        throw new AddCookNotFoundException();
    }

    public void clearPart() {
        throw new AddCookNotFoundException();
    }

    public String toString() {
        throw new AddCookNotFoundException();
    }

    public String getFurniture() {
        throw new AddCookNotFoundException();
    }

    public String getModelId() {
        throw new AddCookNotFoundException();
    }

    public String getParentUUID() {
        throw new AddCookNotFoundException();
    }

    public int getPoint() {
        throw new AddCookNotFoundException();
    }

    public int getStack() {
        throw new AddCookNotFoundException();
    }

    public List<String> getStorage() {
        throw new AddCookNotFoundException();
    }

    public List<String> getParts() {
        throw new AddCookNotFoundException();
    }
}