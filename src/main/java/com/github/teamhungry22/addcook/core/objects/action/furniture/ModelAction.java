package com.github.teamhungry22.addcook.core.objects.action.furniture;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.FurnitureData;
import com.github.teamhungry22.addcook.core.config.data.ModelData;
import com.github.teamhungry22.addcook.core.objects.action.Action;
import com.github.teamhungry22.addcook.core.objects.action.ActionManager;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;

import java.util.List;

/**
 * 요리 재료 모델의 커스텀 모델을 불러오는 Action 클래스
 */
public class ModelAction implements Action {
    public ModelAction(ActionManager am, FurnitureEntity furnitureEntity, FurnitureData furnitureData, ModelData modelData) {
        throw new AddCookNotFoundException();
    }

    public void execute() {
        throw new AddCookNotFoundException();
    }

    private void loadDefaultModel(List<String> randomList) {
        throw new AddCookNotFoundException();
    }

    private void loadModel(List<String> modelList, String bone) {
        throw new AddCookNotFoundException();
    }
}

