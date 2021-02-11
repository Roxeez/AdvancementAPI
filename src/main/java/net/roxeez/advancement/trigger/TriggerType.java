package net.roxeez.advancement.trigger;

import net.roxeez.advancement.condition.BeeNestDestroyed;
import net.roxeez.advancement.condition.BredAnimals;
import net.roxeez.advancement.condition.BrewedPotion;
import net.roxeez.advancement.condition.ChangedDimension;
import net.roxeez.advancement.condition.ChanneledLightning;
import net.roxeez.advancement.condition.InventoryChanged;
import net.roxeez.advancement.condition.PlacedBlock;
import org.jetbrains.annotations.NotNull;

/**
 * Class containing all existing triggers
 */
public final class TriggerType {

    /**
     * Triggers when the player breaks a bee nest or beehive
     */
    @NotNull
    public static final Trigger<BeeNestDestroyed> BEE_NEST_DESTROYED = new Trigger<>("bee_nest_destroyed", BeeNestDestroyed.class);

    /**
     * Triggers after the player breeds 2 animals
     */
    @NotNull
    public static final Trigger<BredAnimals> BRED_ANIMALS = new Trigger<>("bred_animals", BredAnimals.class);

    /**
     * Triggers after any changes happen to the player's inventory
     */
    @NotNull
    public static final Trigger<InventoryChanged> INVENTORY_CHANGED = new Trigger<>("inventory_changed", InventoryChanged.class);

    /**
     * Triggers when the player places a block
     */
    @NotNull
    public static final Trigger<PlacedBlock> PLACED_BLOCK = new Trigger<>("placed_block", PlacedBlock.class);

    /**
     * Triggers after the player takes any item out of a brewing stand
     */
    @NotNull
    public static final Trigger<BrewedPotion> BREWED_POTION = new Trigger<>("brewed_potion", BrewedPotion.class);

    /**
     * Triggers after the player travels between two dimensions
     */
    @NotNull
    public static final Trigger<ChangedDimension> CHANGED_DIMENSION = new Trigger<>("changed_dimension", ChangedDimension.class);

    /**
     * Triggers after the player successfully uses the Channeling enchantment on an entity
     */
    @NotNull
    public static final Trigger<ChanneledLightning> CHANNELED_LIGHTNING = new Trigger<>("channeled_lightning", ChanneledLightning.class);

    private TriggerType() {

    }

}
