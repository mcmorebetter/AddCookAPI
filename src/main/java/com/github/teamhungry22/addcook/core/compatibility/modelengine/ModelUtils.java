package com.github.teamhungry22.addcook.core.compatibility.modelengine;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.ticxo.modelengine.api.model.ActiveModel;
import com.ticxo.modelengine.api.model.ModeledEntity;
import org.bukkit.entity.Entity;

import java.util.Map;
import java.util.Optional;

public class ModelUtils {
    public static boolean hasBBModel(String modelName) {
        throw new AddCookNotFoundException();
    }

    public static ModeledEntity getModeledEntity(Entity entity) {
        throw new AddCookNotFoundException();
    }

    public static Optional<ActiveModel> getActiveModel(Entity entity, String modelId) {
        throw new AddCookNotFoundException();
    }

    public static Map<String, ActiveModel> getActiveModels(Entity entity) {
        throw new AddCookNotFoundException();
    }
}
