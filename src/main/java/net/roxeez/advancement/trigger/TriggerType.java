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

    /**
     * Triggers after the player changes the structure of a beacon
     */
    @NotNull
    public static final Trigger<ConstructBeacon> CONSTRUCT_BEACON = new Trigger<>("construct_beacon", ConstructBeacon.class);

    /**
     * Triggers when the player consumes an item
     */
    @NotNull
    public static final Trigger<ConsumeItem> CONSUME_ITEM = new Trigger<>("consume_item", ConsumeItem.class);

    /**
     * Triggers when the player cures a zombie villager
     */
    @NotNull
    public static final Trigger<CuredZombieVillager> CURED_ZOMBIE_VILLAGER = new Trigger<>("cured_zombie_villager", CuredZombieVillager.class);

    /**
     * Triggers after the player gets a status effect applied or taken from them
     */
    @NotNull
    public static final Trigger<EffectsChanged> EFFECTS_CHANGED = new Trigger<>("effects_changed", EffectsChanged.class);

    /**
     * Triggers after the player enchants an item through an enchanting table (does not get triggered through an anvil, or through commands)
     */
    @NotNull
    public static final Trigger<EnchantedItem> ENCHANTED_ITEM = new Trigger<>("enchanted_item", EnchantedItem.class);

    /**
     * Triggers when the player stands in a block. Checks every tick and will try to trigger for each successful match
     */
    @NotNull
    public static final Trigger<EnterBlock> ENTER_BLOCK = new Trigger<>("enter_block", EnterBlock.class);

    public static final Trigger<EntityHurtPlayer> ENTITY_HURT_PLAYER = new Trigger<>("entity_hurt_player", EntityHurtPlayer.class);

    public static final Trigger<EntityKilledPlayer> ENTITY_KILLED_PLAYER = new Trigger<>("entity_killed_player", EntityKilledPlayer.class);

    public static final Trigger<FilledBucket> FILLED_BUCKET = new Trigger<>("filled_bucket", FilledBucket.class);

    public static final Trigger<FishingRodHooked> FISHING_ROD_HOOKED = new Trigger<>("fishing_rod_hooked", FishingRodHooked.class);

    public static final Trigger<HeroOfTheVillage> HERO_OF_THE_VILLAGE = new Trigger<>("hero_of_the_village", HeroOfTheVillage.class);

    public static final Trigger<Impossible> IMPOSSIBLE = new Trigger<>("impossible", Impossible.class);

    public static final Trigger<ItemDurabilityChanged> ITEM_DURABILITY_CHANGED = new Trigger<>("item_durability_changed", ItemDurabilityChanged.class);

    public static final Trigger<ItemUsedOnBlock> ITEM_USED_ON_BLOCK = new Trigger<>("item_used_on_block", ItemUsedOnBlock.class);

    public static final Trigger<KilledByCrossbow> KILLED_BY_CROSSBOW = new Trigger<>("killed_by_crossbow", KilledByCrossbow.class);

    public static final Trigger<Levitation> LEVITATION = new Trigger<>("levitation", Levitation.class);

    public static final Trigger<Location> LOCATION = new Trigger<>("location", Location.class);

    public static final Trigger<NetherTravel> NETHER_TRAVEL = new Trigger<>("nether_travel", NetherTravel.class);

    public static final Trigger<PlayerGeneratesContainerLoot> PLAYER_GENERATES_CONTAINER_LOOT = new Trigger<>("player_generates_container_loot", PlayerGeneratesContainerLoot.class);

    public static final Trigger<PlayerHurtEntity> PLAYER_HURT_ENTITY = new Trigger<>("player_hurt_entity", PlayerHurtEntity.class);

    public static final Trigger<PlayerInteractedWithEntity> PLAYER_INTERACTED_WITH_ENTITY = new Trigger<>("player_interacted_with_entity", PlayerInteractedWithEntity.class);

    private TriggerType() {

    }

}
