package com.github.teamhungry22.addcook.core.objects.action;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.ConfigManager;
import com.github.teamhungry22.addcook.core.config.data.*;
import com.github.teamhungry22.addcook.core.line.LineManager;
import com.github.teamhungry22.addcook.core.objects.action.furniture.*;
import com.github.teamhungry22.addcook.core.objects.action.item.*;
import com.github.teamhungry22.addcook.core.objects.entity.EntityManager;
import com.github.teamhungry22.addcook.core.objects.furniture.CookResult;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureEntity;
import com.github.teamhungry22.addcook.core.objects.furniture.FurnitureManager;
import com.github.teamhungry22.addcook.core.objects.item.ItemManager;
import com.github.teamhungry22.addcook.core.objects.item.MaterialItem;
import com.github.teamhungry22.addcook.core.objects.item.ToolItem;
import com.github.teamhungry22.addcook.core.objects.item.UseItem;
import com.github.teamhungry22.addcook.core.task.tasks.PointTask;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ActionManager {
    public ActionManager(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    // 가구 설치
    public FurnitureEntity furniturePlace(Player player, Entity entity, Location location, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 가구 파괴
    public void furnitureBreak(Player player, FurnitureEntity furnitureEntity, boolean isForce) {
        throw new AddCookNotFoundException();
    }

    // 가구 모델
    public void furnitureModel(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 파트 추가
    public void partAdd(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, String placeFurniture) {
        throw new AddCookNotFoundException();
    }

    // 파트 제거
    public void partRemove(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 가구 회전
    public void furnitureRotation(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 포인트 추가
    public void pointAdd(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, UseItem useItem) {
        throw new AddCookNotFoundException();
    }

    // 포인트 제거
    public void pointRemove(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, int point) {
        throw new AddCookNotFoundException();
    }
    
    // 포인트 디스플레이
    // 여기서 if (!furnitureData.isPointEnabled()) 검사를 안하는 이유는
    // stack의 디스플레이를 띄우기 위해서
    public PointTask pointDisplay(FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 재료 모델 로드
    public void model(FurnitureEntity furnitureEntity, FurnitureData furnitureData, ModelData modelData) {
        throw new AddCookNotFoundException();
    }

    // 재료 모델 초기화
    public void modelReset(FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 요리 시작
    public void cookStart(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, ToolItem toolItem) {
        throw new AddCookNotFoundException();
    }

    // 요리 결과
    public void cookEnd(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, RecipeData recipeData, CookResult cookResult) {
        throw new AddCookNotFoundException();
    }

    // 요리 디스플레이
    public void cookDisplay(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, RecipeData recipeData, CookResult cookResult) {
        throw new AddCookNotFoundException();
    }

    // 스택 시작
    public void stackStart(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, ToolItem toolItem) {
        throw new AddCookNotFoundException();
    }

    // 스택 결과
    public void stackEnd(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 레시피 북 GUI 열기
    public void recipeOpen(Player player, FurnitureEntity furnitureEntity) {
        throw new AddCookNotFoundException();
    }
    
    // 망치 사용
    public void useHammer(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 뒤집개 사용
    public void useTurner(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // 바닐라 재료 추가
    public void materialVanilla(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }

    // AddCook 재료 추가
    // 여기서 if (!furnitureData.isMaterialEnabled()) 검사를 안하는 이유는
    // AddCook 재료의 effect를 모든 가구에서 사용할 수 있게 하기 위해
    public void materialAddCook(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, MaterialItem materialItem) {
        throw new AddCookNotFoundException();
    }

    // 재료 제거
    public void materialRemove(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        throw new AddCookNotFoundException();
    }
    
    public AddCook getPlugin() {
        throw new AddCookNotFoundException();
    }

    public ConfigManager getConfigManager() {
        throw new AddCookNotFoundException();
    }

    public LineManager getLineManager() {
        throw new AddCookNotFoundException();
    }

    public ItemManager getItemManager() {
        throw new AddCookNotFoundException();
    }

    public EntityManager getEntityManager() {
        throw new AddCookNotFoundException();
    }

    public FurnitureManager getFurnitureManager() {
        throw new AddCookNotFoundException();
    }

    public Map<String, GuiData> getGuiMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, Object> getFailMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, MessageData> getMessageMap() {
        throw new AddCookNotFoundException();
    }

    public Map<String, FurnitureData> getFurnitureMap() {
        throw new AddCookNotFoundException();
    }

    public Map<Integer, List<ModelData>> getModelStageMap() {
        throw new AddCookNotFoundException();
    }

    public Map<UUID, PointTask> getPointTaskMap() {
        throw new AddCookNotFoundException();
    }
}
