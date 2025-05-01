package com.github.teamhungry22.addcook.core.compatibility.mythicmobs;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import io.lumine.mythic.api.adapters.AbstractEntity;
import io.lumine.mythic.api.skills.Skill;
import org.bukkit.entity.Entity;

import java.util.List;

public class MythicFurnitureUtils extends MythicUtils {
    public static boolean executeRequirements(Entity caster, Entity trigger, List<String> list) {
        throw new AddCookNotFoundException();
    }

    public static boolean executeRequirements(Entity caster, Entity trigger, String skillName) {
        throw new AddCookNotFoundException();
    }

    public static boolean executeRequirements(AbstractEntity caster, AbstractEntity trigger, Skill skill) {
        throw new AddCookNotFoundException();
    }

    // 모델을 적용하는 스킬 (모델 초기화 기능도 함)
    public static void setModel(FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }

    // 재료 모델을 교체하는 스킬
    public static void modelChange(FurnitureEntity furnitureEntity, String bone, String newModel, String newBone) {
        throw new AddCookNotFoundException();
    }

    // 모델 색상을 변경하는 스킬
    public static void changeColor(FurnitureEntity furnitureEntity, String bone, String color) {
        throw new AddCookNotFoundException();
    }

    // 가구를 회전하는 스킬
    public static void furnitureRotation(FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }
}
