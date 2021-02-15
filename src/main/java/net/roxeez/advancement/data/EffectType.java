package net.roxeez.advancement.data;

import org.bukkit.NamespacedKey;

public enum EffectType {
    ABSORPTION("absorption"),
    BAD_OMEN("bad_omen"),
    BLINDNESS("blindness"),
    CONDUIT_POWER("conduit_power"),
    DOLPHINS_GRACE("dolphins_grace"),
    FIRE_RESISTANCE("fire_resistance"),
    GLOWING("glowing"),
    HASTE("haste"),
    HEALTH_BOOST("health_boost"),
    HERO_OF_THE_VILLAGE("hero_of_the_village"),
    HUNGER("hunger"),
    INSTANT_HEALTH("instant_health"),
    INSTANT_DAMAGE("instant_damage"),
    INVISIBILITY("invisibility"),
    JUMP_BOOST("jump_boost"),
    LEVITATION("levitation"),
    LUCK("luck"),
    MINING_FATIGUE("mining_fatigue"),
    NAUSEA("nausea"),
    NIGHT_VISION("night_vision"),
    POISON("poison"),
    REGENERATION("regeneration"),
    RESISTANCE("resistance"),
    SATURATION("saturation"),
    SLOW_FALLING("slow_falling"),
    SLOWNESS("slowness"),
    SPEED("speed"),
    STRENGTH("strength"),
    BAD_LUCK("bad_luck"),
    WATER_BREATHING("water_breathing"),
    WEAKNESS("weakness"),
    WITHER("wither");

    private final NamespacedKey key;

    EffectType(String name) {
        this.key = NamespacedKey.minecraft(name);
    }

    public NamespacedKey getKey() {
        return key;
    }
}
