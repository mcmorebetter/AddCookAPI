package com.github.teamhungry22.addcook.core.compatibility.mythicmobs;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import io.lumine.mythic.api.config.MythicConfig;
import io.lumine.mythic.api.skills.placeholders.PlaceholderDouble;
import io.lumine.mythic.api.skills.placeholders.PlaceholderInt;
import io.lumine.mythic.api.skills.placeholders.PlaceholderString;
import io.lumine.mythic.bukkit.utils.serialize.Chroma;
import io.lumine.mythic.core.config.GenericConfig;
import io.lumine.mythic.core.skills.placeholders.parsers.PlaceholderColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * AddCook 내부에서 미몹 소환, 스킬 재생 등에 필요한 MythicConfig를 사용하기 위해 제작된 클래스
 */
public class MythicConfigImpl implements GenericConfig, Cloneable, MythicConfig {
    public MythicConfigImpl(String configName, ConfigurationSection fc) {
        throw new AddCookNotFoundException();
    }

    public void setKey(String key) {
        throw new AddCookNotFoundException();
    }

    public String getKey() {
        throw new AddCookNotFoundException();
    }

    public String getFileName() {
        throw new AddCookNotFoundException();
    }

    public FileConfiguration getFileConfiguration() {
        throw new AddCookNotFoundException();
    }

    public String getNode(String field) {
        throw new AddCookNotFoundException();
    }

    public void deleteNodeAndSave() {
        throw new AddCookNotFoundException();
    }

    public boolean isSet(String key) {
        throw new AddCookNotFoundException();
    }

    public String determineWhichKeyToUse(String def, String... keys) {
        throw new AddCookNotFoundException();
    }

    public void set(String key, Object value) {
        throw new AddCookNotFoundException();
    }

    public void setSave(String field, Object value) {
        throw new AddCookNotFoundException();
    }

    public void unset(String field) {
        throw new AddCookNotFoundException();
    }

    public void unsetSave(String key) {
        throw new AddCookNotFoundException();
    }

    public void load() {
        throw new AddCookNotFoundException();
    }

    public void save() {}

    public MythicConfig getNestedConfig(String key) {
        throw new AddCookNotFoundException();
    }

    public Map<String, MythicConfig> getNestedConfigs(String field) {
        throw new AddCookNotFoundException();
    }

    public String getString(String field) {
        throw new AddCookNotFoundException();
    }

    public String getString(String[] key) {
        throw new AddCookNotFoundException();
    }

    public String getString(String field, String def) {
        throw new AddCookNotFoundException();
    }

    public String getString(String[] keysToCheck, String finalDefaultValue, String... defaultValues) {
        throw new AddCookNotFoundException();
    }

    public Chroma getColor(String field) {
        throw new AddCookNotFoundException();
    }

    public Chroma getColor(String field, Chroma def) {
        throw new AddCookNotFoundException();
    }

    public PlaceholderString getPlaceholderString(String field) {
        throw new AddCookNotFoundException();
    }

    public PlaceholderString getPlaceholderString(String field, String def) {
        throw new AddCookNotFoundException();
    }

    public String getColorString(String field) {
        throw new AddCookNotFoundException();
    }

    public String getColorString(String field, String def) {
        throw new AddCookNotFoundException();
    }

    public boolean getBoolean(String field) {
        throw new AddCookNotFoundException();
    }

    public boolean getBoolean(String field, boolean def) {
        throw new AddCookNotFoundException();
    }

    public Boolean getBooleanNullable(String field) {
        throw new AddCookNotFoundException();
    }

    public Boolean getBooleanNullable(String[] field) {
        throw new AddCookNotFoundException();
    }

    public int getInteger(String field) {
        throw new AddCookNotFoundException();
    }

    public int getInteger(String field, int def) {
        throw new AddCookNotFoundException();
    }

    public int getInteger(String[] keys, int def) {
        throw new AddCookNotFoundException();
    }

    @Deprecated
    public int getInt(String field) {
        throw new AddCookNotFoundException();
    }

    /** @deprecated */
    @Deprecated
    public int getInt(String field, int def) {
        throw new AddCookNotFoundException();
    }

    public float getFloat(String field) {
        throw new AddCookNotFoundException();
    }

    public float getFloat(String field, float def) {
        throw new AddCookNotFoundException();
    }

    public double getDouble(String field) {
        throw new AddCookNotFoundException();
    }

    public double getDouble(String field, double def) {
        throw new AddCookNotFoundException();
    }

    public List<String> getStringList(String field) {
        throw new AddCookNotFoundException();
    }

    public List<String> getStringList(String field, List<String> def) {
        throw new AddCookNotFoundException();
    }

    public List<String> getColorStringList(String field) {
        throw new AddCookNotFoundException();
    }

    public List<PlaceholderString> getPlaceholderStringList(String field) {
        throw new AddCookNotFoundException();
    }

    public List<PlaceholderString> getPlaceholderStringList(String field, List<String> def) {
        throw new AddCookNotFoundException();
    }

    public List<PlaceholderString> getPlaceholderStringListAlt(String field, List<PlaceholderString> def) {
        throw new AddCookNotFoundException();
    }

    public List<Map<?, ?>> getMapList(String field) {
        throw new AddCookNotFoundException();
    }

    public List<?> getList(String field) {
        throw new AddCookNotFoundException();
    }

    public List<Byte> getByteList(String field) {
        throw new AddCookNotFoundException();
    }

    public ItemStack getItemStack(String field, String def) {
        throw new AddCookNotFoundException();
    }

    public boolean isConfigurationSection(String field) {
        throw new AddCookNotFoundException();
    }

    public Set<String> getKeys() {
        throw new AddCookNotFoundException();
    }

    public Set<String> getKeys(String field) {
        throw new AddCookNotFoundException();
    }

    public boolean isList(String field) {
        throw new AddCookNotFoundException();
    }

    public PlaceholderInt getPlaceholderInt(String key, String def) {
        throw new AddCookNotFoundException();
    }

    public PlaceholderInt getPlaceholderInt(String[] key, String def) {
        throw new AddCookNotFoundException();
    }

    public PlaceholderInt getPlaceholderInt(String[] key, String def, String... args) {
        throw new AddCookNotFoundException();
    }

    public PlaceholderDouble getPlaceholderDouble(String key, String def) {
        throw new AddCookNotFoundException();
    }

    public PlaceholderDouble getPlaceholderDouble(String[] key, String def, String... args) {
        throw new AddCookNotFoundException();
    }

    public PlaceholderColor getPlaceholderColor(String key, String def) {
        throw new AddCookNotFoundException();
    }

    public <T extends Enum> T getEnum(String field, Class<T> clazz, T def) {
        throw new AddCookNotFoundException();
    }

    public void merge(MythicConfig tmplConfig, List<String> keysToIgnore) {}

    public File getFile() {
        throw new AddCookNotFoundException();
    }
}
