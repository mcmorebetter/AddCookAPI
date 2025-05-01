package com.github.teamhungry22.addcook.core.objects.action;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.event.StackEndEvent;
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
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class ActionManager {
    private final AddCook plugin;
    private final ConfigManager configManager;
    private final LineManager lineManager;
    private final ItemManager itemManager;
    private final EntityManager entityManager;
    private final FurnitureManager furnitureManager;
    private final Map<String, GuiData> guiMap;
    private final Map<String, Object> failMap;
    private final Map<String, MessageData> messageMap;
    private final Map<String, FurnitureData> furnitureMap;
    private final Map<Integer, List<ModelData>> modelStageMap;

    private final Map<UUID, PointTask> pointTaskMap = new HashMap<>();

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
    // 여기서 if (!furnitureData.isPointEnabled()) 검사를 안하는 이유는 stack의 디스플레이를 띄우기 위해서
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
        CookEndAction action = new CookEndAction(this, player, furnitureEntity, furnitureData, recipeData, cookResult);
        action.execute();
    }

    // 요리 디스플레이
    public void cookDisplay(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, RecipeData recipeData, CookResult cookResult) {
        CookDisplayAction action = new CookDisplayAction(this, player, furnitureEntity, furnitureData, recipeData, cookResult);
        action.execute();
    }

    // 스택 시작
    public void stackStart(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, ToolItem toolItem) {
        StackStartAction action = new StackStartAction(this, player, furnitureEntity, furnitureData, toolItem);
        action.execute();
    }

    // 스택 결과
    public void stackEnd(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        StackEndAction action = new StackEndAction(this, player, furnitureEntity, furnitureData);
        action.execute();
    }

    // 레시피 북 GUI 열기
    public void recipeOpen(Player player, FurnitureEntity furnitureEntity) {
        RecipeBookOpenAction action = new RecipeBookOpenAction(this, player, furnitureEntity);
        action.execute();
    }
    
    // 망치 사용
    public void useHammer(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        HammerAction action = new HammerAction(this, player, furnitureEntity, furnitureData);
        action.execute();
    }

    // 뒤집개 사용
    public void useTurner(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        TurnerAction action = new TurnerAction(this, player, furnitureEntity, furnitureData);
        action.execute();
    }

    // 바닐라 재료 추가
    public void materialVanilla(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        if (!furnitureData.isMaterialEnabled()) return;
        MaterialVanillaAction action = new MaterialVanillaAction(this, player, furnitureEntity, furnitureData);
        action.execute();
    }

    // AddCook 재료 추가
    public void materialAddCook(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData, MaterialItem materialItem) {
        if (!furnitureData.isMaterialEnabled()) return;
        MaterialAddCookAction action = new MaterialAddCookAction(this, player, furnitureEntity, furnitureData, materialItem);
        action.execute();
    }

    // 재료 제거
    public void materialRemove(Player player, FurnitureEntity furnitureEntity, FurnitureData furnitureData) {
        MaterialRemoveAction action = new MaterialRemoveAction(this, player, furnitureEntity, furnitureData);
        action.execute();
    }
    
    public AddCook getPlugin() {
        return plugin;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    public LineManager getLineManager() {
        return lineManager;
    }

    public ItemManager getItemManager() {
        return itemManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public FurnitureManager getFurnitureManager() {
        return furnitureManager;
    }

    public Map<String, GuiData> getGuiMap() {
        return guiMap;
    }

    public Map<String, Object> getFailMap() {
        return failMap;
    }

    public Map<String, MessageData> getMessageMap() {
        return messageMap;
    }

    public Map<String, FurnitureData> getFurnitureMap() {
        return furnitureMap;
    }

    public Map<Integer, List<ModelData>> getModelStageMap() {
        return modelStageMap;
    }

    public Map<UUID, PointTask> getPointTaskMap() {
        return pointTaskMap;
    }
}
