package net.roxeez.advancement.display;

import org.bukkit.NamespacedKey;

/**
 * All possible background for an achievement tab
 */
public enum BackgroundType {

    BEDROCK("bedrock"),
    STONE("stone"),
    SMOOTH_STONE("smooth_stone"),
    SMOOTH_STONE_SLAB("smooth_stone_slab"),
    STONE_BRICKS("stone_bricks"),
    CRACKED_STONE_BRICKS("cracked_stone_bricks"),
    MOSSY_STONE_BRICKS("mossy_stone_bricks"),
    CHISELED_STONE_BRICKS("chiseled_stone_bricks"),
    COBBLESTONE("cobblestone"),
    MOSSY_COBBLESTONE("mossy_cobblestone"),
    GRANITE("granite"),
    POLISHED_GRANITE("polished_granite"),
    DIORITE("diorite"),
    POLISHED_DIORITE("polished_diorite"),
    ANDESITE("andesite"),
    POLISHED_ANDESITE("polished_andesite");

    private final NamespacedKey texture;

    BackgroundType(String texture) {
        this.texture = NamespacedKey.minecraft("textures/block/" + texture + ".png");
    }

    public NamespacedKey getTexture() {
        return texture;
    }

}
