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

    private TriggerType() {

    }

}
