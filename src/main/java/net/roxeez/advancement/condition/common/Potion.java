package net.roxeez.advancement.condition.common;

import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

/**
 * Represent all possible potion types
 */
public enum Potion {

    UNCRAFTABLE("empty"),
    WATER("water"),
    MUNDANE("mundane"),
    THICK("thick"),
    AWKWARD("awkward"),
    NIGHT_VISION("night_vision"),
    NIGHT_VISION_EXTENDED("long_night_vision"),
    INVISIBILITY("invisibility"),
    INVISIBILITY_EXTENDED("long_invisibility"),
    LEAPING("leaping"),
    LEAPING_II("strong_leaping"),
    LEAPING_EXTENDED("long_leaping"),
    FIRE_RESISTANCE("fire_resistance"),
    FIRE_RESISTANCE_EXTENDED("fire_resistance_extended"),
    SWIFTNESS("swiftness"),
    SWIFTNESS_II("strong_swiftness"),
    SWIFTNESS_EXTENDED("long_swiftness"),
    SLOWNESS("slowness"),
    SLOWNESS_II("strong_slowness"),
    SLOWNESS_EXTENDED("long_slowness"),
    WATER_BREATHING("water_breathing"),
    WATER_BREATHING_EXTENDED("long_water_breathing"),
    INSTANT_HEALTH("healing"),
    INSTANT_HEALTH_II("strong_healing"),
    HARMING("harming"),
    HARMING_II("strong_harming"),
    POISON("poison"),
    POISON_II("strong_poison"),
    POISON_EXTENDED("long_poison"),
    REGENERATION("regeneration"),
    REGENERATION_II("strong_regeneration"),
    REGENERATION_EXTENDED("long_regeneration"),
    STRENGTH("strength"),
    STRENGTH_II("strong_strength"),
    STRENGTH_EXTENDED("long_strength"),
    WEAKNESS("weakness"),
    WEAKNESS_EXTENDED("long_weakness"),
    LUCK("luck"),
    THE_TURTLE_MASTER("turtle_master"),
    THE_TURTLE_MASTER_II("strong_turtle_master"),
    THE_TURTLE_MASTER_EXTENDED("long_turtle_master"),
    SLOW_FALLING("slow_falling"),
    SLOW_FALLING_EXTENDED("long_slow_falling");

    private final NamespacedKey key;

    Potion(@NotNull String name) {
        this.key = NamespacedKey.minecraft(name);
    }

    /**
     * Key of this potion
     *
     * @return Key of this potion
     */
    @NotNull
    public NamespacedKey getKey() {
        return key;
    }

}
