package com.github.teamhungry22.addcook.core.objects.furniture;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.entity.EntityManager;
import org.bukkit.Location;

public class FurnitureManager extends EntityManager {
    public FurnitureManager(AddCook plugin) {
        super(plugin);
    }

    // furniture 이름으로된 가구가 해당 첨크에 총 몇 개인지
    public int getFurnitureFromChunk(Location location, String furniture) {
        throw new AddCookNotFoundException();
    }

    // 요리 취소 기능
    public void cancelCooking(FurnitureEntity entity) {
        throw new AddCookNotFoundException();
    }
}
