package com.github.teamhungry22.addcook.core.objects.furniture;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.core.objects.entity.EntityManager;
import org.bukkit.Location;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class FurnitureManager extends EntityManager {
    public FurnitureManager(AddCook plugin) {
        super(plugin);
    }

    // furniture 이름으로된 가구가 해당 첨크에 총 몇 개인지
    public int getFurnitureFromChunk(Location location, String furniture) {
        throw new AddCookNotFoundException();
    }
//
//    // 모델 불러오기
//    private void modelLoad(Entity entity, ModeledEntity modeledEntity, FurnitureEntity furnitureEntity) {
//        if (!(entity instanceof Interaction interaction)) {
//            return;
//        }
//
//        if (modeledEntity == null) { // 모델이 아예 안 보이기 때문에 노쿨
//
//            String modelId = furnitureEntity.getModelId();
//            MythicUtils.useSkill(interaction, "addcook_furniture_model", metadata -> metadata.getParameters().put("model", modelId));
//        }
//
//        String furniture = furnitureEntity.getFurniture();
//        if (furniture.equalsIgnoreCase("stove")) {
//            return;
//        }
//
//        List<MetadataValue> interactTime = interaction.getMetadata("interact_time");
//        if (interactTime.isEmpty()) {
//            interaction.setMetadata("interact_time", new FixedMetadataValue(plugin, System.currentTimeMillis()));
//            subModelLoad(interaction, furnitureEntity);
//            return;
//        }
//
//        long lastTime = interactTime.getFirst().asLong();
//        long now = System.currentTimeMillis();
//        long cooldown = (long) configManager.getFurnitureModelLoadTime() * 1000;
//
//        if (now - lastTime < cooldown) {
//            return;
//        }
//
//        interaction.setMetadata("interact_time", new FixedMetadataValue(plugin, System.currentTimeMillis()));
//        subModelLoad(interaction, furnitureEntity);
//    }

}
