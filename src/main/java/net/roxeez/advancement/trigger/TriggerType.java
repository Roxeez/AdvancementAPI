package net.roxeez.advancement.trigger;

import org.jetbrains.annotations.NotNull;

/**
 * Class containing all existing triggers
 */
public final class TriggerType {

    /**
     * Triggers when the player breaks a bee nest or beehive
     */
    @NotNull
    public static final Trigger<BeeNestDestroyedData> BEE_NEST_DESTROYED = new Trigger<>("bee_nest_destroyed", BeeNestDestroyedData.class);

    /**
     * Triggers after the player breeds 2 animals
     */
    @NotNull
    public static final Trigger<BredAnimalsData> BRED_ANIMALS = new Trigger<>("bred_animals", BredAnimalsData.class);

    /**
     * Triggers after any changes happen to the player's inventory
     */
    @NotNull
    public static final Trigger<InventoryChangedData> INVENTORY_CHANGED = new Trigger<>("inventory_changed", InventoryChangedData.class);

    /**
     * Triggers when the player places a block
     */
    @NotNull
    public static final Trigger<PlacedBlockData> PLACED_BLOCK = new Trigger<>("placed_block", PlacedBlockData.class);

    /**
     * Triggers after the player takes any item out of a brewing stand
     */
    @NotNull
    public static final Trigger<BrewedPotionData> BREWED_POTION = new Trigger<>("brewed_potion", BrewedPotionData.class);

    /**
     * Triggers after the player travels between two dimensions
     */
    @NotNull
    public static final Trigger<ChangedDimensionData> CHANGED_DIMENSION = new Trigger<>("changed_dimension", ChangedDimensionData.class);

    /**
     * Triggers after the player successfully uses the Channeling enchantment on an entity
     */
    @NotNull
    public static final Trigger<ChanneledLightningData> CHANNELED_LIGHTNING = new Trigger<>("channeled_lightning", ChanneledLightningData.class);

    /**
     * Triggers after the player changes the structure of a beacon
     */
    @NotNull
    public static final Trigger<ConstructBeaconData> CONSTRUCT_BEACON = new Trigger<>("construct_beacon", ConstructBeaconData.class);

    /**
     * Triggers when the player consumes an item
     */
    @NotNull
    public static final Trigger<ConsumeItemData> CONSUME_ITEM = new Trigger<>("consume_item", ConsumeItemData.class);

    /**
     * Triggers when the player cures a zombie villager
     */
    @NotNull
    public static final Trigger<CuredZombieVillagerData> CURED_ZOMBIE_VILLAGER = new Trigger<>("cured_zombie_villager", CuredZombieVillagerData.class);

    /**
     * Triggers after the player gets a status effect applied or taken from them
     */
    @NotNull
    public static final Trigger<EffectsChangedData> EFFECTS_CHANGED = new Trigger<>("effects_changed", EffectsChangedData.class);

    /**
     * Triggers after the player enchants an item through an enchanting table (does not get triggered through an anvil, or through commands)
     */
    @NotNull
    public static final Trigger<EnchantedItemData> ENCHANTED_ITEM = new Trigger<>("enchanted_item", EnchantedItemData.class);

    /**
     * Triggers when the player stands in a block. Checks every tick and will try to trigger for each successful match
     */
    @NotNull
    public static final Trigger<EnterBlockData> ENTER_BLOCK = new Trigger<>("enter_block", EnterBlockData.class);

    public static final Trigger<EntityHurtPlayerData> ENTITY_HURT_PLAYER = new Trigger<>("entity_hurt_player", EntityHurtPlayerData.class);

    private TriggerType() {

    }

}
