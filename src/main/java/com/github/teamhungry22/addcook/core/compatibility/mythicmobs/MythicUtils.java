package com.github.teamhungry22.addcook.core.compatibility.mythicmobs;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import io.lumine.mythic.api.adapters.AbstractEntity;
import io.lumine.mythic.api.adapters.AbstractItemStack;
import io.lumine.mythic.api.adapters.AbstractLocation;
import io.lumine.mythic.api.mobs.MythicMob;
import io.lumine.mythic.api.skills.Skill;
import io.lumine.mythic.api.skills.SkillMetadata;
import io.lumine.mythic.bukkit.BukkitAPIHelper;
import io.lumine.mythic.bukkit.MythicBukkit;
import io.lumine.mythic.core.items.ItemExecutor;
import io.lumine.mythic.core.items.MythicItem;
import io.lumine.mythic.core.mobs.ActiveMob;
import io.lumine.mythic.core.mobs.MobExecutor;
import io.lumine.mythic.core.skills.SkillExecutor;
import io.lumine.mythic.core.skills.placeholders.PlaceholderExecutor;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class MythicUtils {
    public static MythicBukkit getMMBukkit() {
        throw new AddCookNotFoundException();
    }

    public static BukkitAPIHelper getMMAPI() {
        throw new AddCookNotFoundException();
    }

    public static MobExecutor getMobManager() {
        throw new AddCookNotFoundException();
    }

    public static ItemExecutor getItemManager() {
        throw new AddCookNotFoundException();
    }

    public static SkillExecutor getSkillManager() {
        throw new AddCookNotFoundException();
    }

    public static PlaceholderExecutor getPlaceholderManager() {
        throw new AddCookNotFoundException();
    }

    public static AbstractEntity adapt(Entity entity) {
        throw new AddCookNotFoundException();
    }

    public static AbstractLocation adapt(Location location) {
        throw new AddCookNotFoundException();
    }

    public static AbstractItemStack adapt(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static boolean hasMythicMob(String mobName) {
        throw new AddCookNotFoundException();
    }

    public static boolean hasMythicSkill(String skillName) {
        throw new AddCookNotFoundException();
    }

    public static MythicMob getMythicMob(String mythicMobName) {
        throw new AddCookNotFoundException();
    }

    public static boolean isMythicItem(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static Optional<MythicItem> getMythicItem(Object obj) {
        throw new AddCookNotFoundException();
    }

    public static String getMythicItemID(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public static ActiveMob getActiveMob(Object obj) {
        throw new AddCookNotFoundException();
    }

    public static void spawnMob(String key, Location location) {
        throw new AddCookNotFoundException();
    }

    public static void executeSkill(Entity caster, Entity trigger, List<String> list) {
        throw new AddCookNotFoundException();
    }

    public static void executeSkill(Entity caster, Entity trigger, String skillName) {
        throw new AddCookNotFoundException();
    }

    public static void executeSkill(Entity caster, Entity trigger, Skill skill, boolean isRequirement) {
        throw new AddCookNotFoundException();
    }

    public static void executeSkill(AbstractEntity caster, AbstractEntity trigger, Skill skill) {
        throw new AddCookNotFoundException();
    }

    public static void executeSkillAPI(Entity entity, String skillName) {
        throw new AddCookNotFoundException();
    }

    public static void executeSkillAPI(Entity entity, String skillName, Consumer<SkillMetadata> consumer) {
        throw new AddCookNotFoundException();
    }

    // 문자열을 ConfigurationSection으로 변환하여 스킬을 등록합니다.
    public static void registerSkillSection(String key, String... lines) {
        throw new AddCookNotFoundException();
    }

    /**
     * 미몹 스킬을 ConfigurationSection으로 받아와 스킬을 등록할 수 있습니다.
     * @param id       스킬을 등록할 때 사용하는 id
     * @param key      실행할 스킬 키 (section 내 key)
     * @param section  다음과 같은 yaml 내부 섹션으로 받아와야 함
     *                 예:
     *                 test_skill: # < 이게 key가 되는거임
     *                   Conditions:
     *                     - hasTag{t=customTag} true
     *                   Skills:
     *                     - message{m=테스트} @self
     */
    public static void registerSkillSection(String id, String key, ConfigurationSection section) {
        throw new AddCookNotFoundException();
    }

    public static SkillMetadata getMetadata(AbstractEntity caster, AbstractEntity trigger) {
        throw new AddCookNotFoundException();
    }

    // 문자열을 미몹 스킬 구조에 맞춘 ConfigurationSection으로 변환합니다.
    private static ConfigurationSection createSkillSection(String key, String... lines) {
        throw new AddCookNotFoundException();
    }
}
