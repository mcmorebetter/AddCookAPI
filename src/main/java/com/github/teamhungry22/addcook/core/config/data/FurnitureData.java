package com.github.teamhungry22.addcook.core.config.data;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.objects.item.AddCookItem;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;
import java.util.Map;

public class FurnitureData {
    public FurnitureData(String id, String name, List<String> permissionList, AddCookItem itemStack, String model,
                         boolean cancelPlace, boolean cancelDrop, boolean cancelRotation, boolean cancelColorChange,
                         int chunkLimit, String dropOffset, String displayOffset, List<String> materialWhitelist,
                         boolean materialEnabled, String materialBone, double materialCooldown, int materialLimit,
                         boolean partEnabled, boolean partInfinite, boolean dropPart, double partCooldown, int partLimit, List<String> partFurnitureList,
                         boolean pointEnabled, boolean pointInfinite, double pointCooldown, int pointLimit,
                         boolean cookEnabled, String cookType, double cookCooldown,
                         boolean cookFadeColorEnabled, String cookFadeColorBone,
                         boolean stackEnabled, double stackCooldown, int stackLimit,
                         ConfigurationSection pointDisplaySection, ConfigurationSection cookDisplaySection, ConfigurationSection stackDisplaySection) {
        throw new AddCookNotFoundException();
    }

    public Map<String, List<String>> registerSkills(String type, ConfigurationSection section) {
        throw new AddCookNotFoundException();
    }

    private List<Part> registerPart(List<String> partFurnitureList) {
        throw new AddCookNotFoundException();
    }

    private double[] convertXYZ(String xyz) {
        throw new AddCookNotFoundException();
    }

    public record Part(String partName, double[] xyz) {}

    private Display registerDisplay(String displayName, ConfigurationSection section) {
        throw new AddCookNotFoundException();
    }

    private int[] convertBackgroundColor(String backgroundColor) {
        throw new AddCookNotFoundException();
    }

    public record Display(String displayName, boolean enabled, String text, String type, double scale, int opacity, String billboard, int[] backgroundColor) {}

    public String getId() {
        throw new AddCookNotFoundException();
    }

    public String getName() {
        throw new AddCookNotFoundException();
    }

    public List<String> getPermissionList() {
        throw new AddCookNotFoundException();
    }

    public AddCookItem getItemStack() {
        throw new AddCookNotFoundException();
    }

    public String getModel() {
        throw new AddCookNotFoundException();
    }

    public boolean isCancelPlace() {
        throw new AddCookNotFoundException();
    }

    public boolean isCancelDrop() {
        throw new AddCookNotFoundException();
    }

    public boolean isCancelRotation() {
        throw new AddCookNotFoundException();
    }

    public boolean isCancelColorChange() {
        throw new AddCookNotFoundException();
    }

    public int getChunkLimit() {
        throw new AddCookNotFoundException();
    }

    public List<String> getMaterialWhiteList() {
        throw new AddCookNotFoundException();
    }

    public boolean isMaterialEnabled() {
        throw new AddCookNotFoundException();
    }

    public String getMaterialBone() {
        throw new AddCookNotFoundException();
    }

    public double getMaterialCooldown() {
        throw new AddCookNotFoundException();
    }

    public int getMaterialLimit() {
        throw new AddCookNotFoundException();
    }

    public boolean isPartEnabled() {
        throw new AddCookNotFoundException();
    }

    public boolean isPartInfinite() {
        throw new AddCookNotFoundException();
    }

    public boolean isDropPart() {
        throw new AddCookNotFoundException();
    }

    public double getPartCooldown() {
        throw new AddCookNotFoundException();
    }

    public int getPartLimit() {
        throw new AddCookNotFoundException();
    }

    public boolean isPointEnabled() {
        throw new AddCookNotFoundException();
    }

    public boolean isPointInfinite() {
        throw new AddCookNotFoundException();
    }

    public double getPointCooldown() {
        throw new AddCookNotFoundException();
    }

    public int getPointLimit() {
        throw new AddCookNotFoundException();
    }

    public boolean isCookEnabled() {
        throw new AddCookNotFoundException();
    }

    public String getCookType() {
        throw new AddCookNotFoundException();
    }

    public double getCookCooldown() {
        throw new AddCookNotFoundException();
    }

    public double[] getDropOffset() {
        throw new AddCookNotFoundException();
    }

    public double[] getDisplayOffset() {
        throw new AddCookNotFoundException();
    }

    public boolean isCookFadeColorEnabled() {
        throw new AddCookNotFoundException();
    }

    public String getCookFadeColorBone() {
        throw new AddCookNotFoundException();
    }

    public boolean isStackEnabled() {
        throw new AddCookNotFoundException();
    }

    public double getStackCooldown() {
        throw new AddCookNotFoundException();
    }

    public int getStackLimit() {
        throw new AddCookNotFoundException();
    }

    public Display getPointDisplay() {
        throw new AddCookNotFoundException();
    }

    public Display getCookDisplay() {
        throw new AddCookNotFoundException();
    }

    public Display getStackDisplay() {
        throw new AddCookNotFoundException();
    }

    public List<Part> getPartFurnitureList() {
        throw new AddCookNotFoundException();
    }

    public Map<String, List<String>> getRequirementsMap() {
        throw new AddCookNotFoundException();
    }

    public void setRequirementsMap(Map<String, List<String>> requirementsMap) {
        throw new AddCookNotFoundException();
    }

    public Map<String, List<String>> getEventsMap() {
        throw new AddCookNotFoundException();
    }

    public void setEventsMap(Map<String, List<String>> eventsMap) {
        throw new AddCookNotFoundException();
    }
}
