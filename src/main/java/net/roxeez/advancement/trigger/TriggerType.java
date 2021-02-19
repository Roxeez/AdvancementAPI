package net.roxeez.advancement.trigger;

import org.jetbrains.annotations.NotNull;

/**
 * Class containing all existing triggers
 */
public final class TriggerType {

    /**
     * Triggers when the player breaks a bee nest or beehive
     */
    public static final TriggerWrapper<BeeNestDestroyed> BEE_NEST_DESTROYED = new TriggerWrapper<>("bee_nest_destroyed", BeeNestDestroyed.class);

    /**
     * Triggers after the player breeds 2 animals
     */
    public static final TriggerWrapper<BredAnimals> BRED_ANIMALS = new TriggerWrapper<>("bred_animals", BredAnimals.class);

    /**
     * Triggers after any changes happen to the player's inventory
     */
    public static final TriggerWrapper<InventoryChanged> INVENTORY_CHANGED = new TriggerWrapper<>("inventory_changed", InventoryChanged.class);

    /**
     * Triggers when the player places a block
     */
    public static final TriggerWrapper<PlacedBlock> PLACED_BLOCK = new TriggerWrapper<>("placed_block", PlacedBlock.class);

    /**
     * Triggers after the player takes any item out of a brewing stand
     */
    public static final TriggerWrapper<BrewedPotion> BREWED_POTION = new TriggerWrapper<>("brewed_potion", BrewedPotion.class);

    /**
     * Triggers after the player travels between two dimensions
     */
    public static final TriggerWrapper<ChangedDimension> CHANGED_DIMENSION = new TriggerWrapper<>("changed_dimension", ChangedDimension.class);

    /**
     * Triggers after the player successfully uses the Channeling enchantment on an entity
     */
    public static final TriggerWrapper<ChanneledLightning> CHANNELED_LIGHTNING = new TriggerWrapper<>("channeled_lightning", ChanneledLightning.class);

    /**
     * Triggers after the player changes the structure of a beacon
     */
    public static final TriggerWrapper<ConstructBeacon> CONSTRUCT_BEACON = new TriggerWrapper<>("construct_beacon", ConstructBeacon.class);

    /**
     * Triggers when the player consumes an item
     */
    public static final TriggerWrapper<ConsumeItem> CONSUME_ITEM = new TriggerWrapper<>("consume_item", ConsumeItem.class);

    /**
     * Triggers when the player cures a zombie villager
     */
    public static final TriggerWrapper<CuredZombieVillager> CURED_ZOMBIE_VILLAGER = new TriggerWrapper<>("cured_zombie_villager", CuredZombieVillager.class);

    /**
     * Triggers after the player gets a status effect applied or taken from them
     */
    public static final TriggerWrapper<EffectsChanged> EFFECTS_CHANGED = new TriggerWrapper<>("effects_changed", EffectsChanged.class);

    /**
     * Triggers after the player enchants an item through an enchanting table (does not get triggered through an anvil, or through commands)
     */
    public static final TriggerWrapper<EnchantedItem> ENCHANTED_ITEM = new TriggerWrapper<>("enchanted_item", EnchantedItem.class);

    /**
     * Triggers when the player stands in a block. Checks every tick and will try to trigger for each successful match
     */
    public static final TriggerWrapper<EnterBlock> ENTER_BLOCK = new TriggerWrapper<>("enter_block", EnterBlock.class);

    public static final TriggerWrapper<EntityHurtPlayer> ENTITY_HURT_PLAYER = new TriggerWrapper<>("entity_hurt_player", EntityHurtPlayer.class);

    public static final TriggerWrapper<EntityKilledPlayer> ENTITY_KILLED_PLAYER = new TriggerWrapper<>("entity_killed_player", EntityKilledPlayer.class);

    public static final TriggerWrapper<FilledBucket> FILLED_BUCKET = new TriggerWrapper<>("filled_bucket", FilledBucket.class);

    public static final TriggerWrapper<FishingRodHooked> FISHING_ROD_HOOKED = new TriggerWrapper<>("fishing_rod_hooked", FishingRodHooked.class);

    public static final TriggerWrapper<HeroOfTheVillage> HERO_OF_THE_VILLAGE = new TriggerWrapper<>("hero_of_the_village", HeroOfTheVillage.class);

    public static final TriggerWrapper<Impossible> IMPOSSIBLE = new TriggerWrapper<>("impossible", Impossible.class);

    public static final TriggerWrapper<ItemDurabilityChanged> ITEM_DURABILITY_CHANGED = new TriggerWrapper<>("item_durability_changed", ItemDurabilityChanged.class);

    public static final TriggerWrapper<ItemUsedOnBlock> ITEM_USED_ON_BLOCK = new TriggerWrapper<>("item_used_on_block", ItemUsedOnBlock.class);

    public static final TriggerWrapper<KilledByCrossbow> KILLED_BY_CROSSBOW = new TriggerWrapper<>("killed_by_crossbow", KilledByCrossbow.class);

    public static final TriggerWrapper<Levitation> LEVITATION = new TriggerWrapper<>("levitation", Levitation.class);

    public static final TriggerWrapper<Location> LOCATION = new TriggerWrapper<>("location", Location.class);

    public static final TriggerWrapper<NetherTravel> NETHER_TRAVEL = new TriggerWrapper<>("nether_travel", NetherTravel.class);

    public static final TriggerWrapper<PlayerGeneratesContainerLoot> PLAYER_GENERATES_CONTAINER_LOOT = new TriggerWrapper<>("player_generates_container_loot", PlayerGeneratesContainerLoot.class);

    public static final TriggerWrapper<PlayerHurtEntity> PLAYER_HURT_ENTITY = new TriggerWrapper<>("player_hurt_entity", PlayerHurtEntity.class);

    public static final TriggerWrapper<PlayerInteractedWithEntity> PLAYER_INTERACTED_WITH_ENTITY = new TriggerWrapper<>("player_interacted_with_entity", PlayerInteractedWithEntity.class);

    public static final TriggerWrapper<PlayerKilledEntity> PLAYER_KILLED_ENTITY = new TriggerWrapper<>("player_killed_entity", PlayerKilledEntity.class);

    public static final TriggerWrapper<RecipeUnlocked> RECIPE_UNLOCKED = new TriggerWrapper<>("recipe_unlocked", RecipeUnlocked.class);

    public static final TriggerWrapper<ShotCrossbow> SHOT_CROSSBOW = new TriggerWrapper<>("short_crossbow", ShotCrossbow.class);

    public static final TriggerWrapper<SleptInBed> SLEPT_IN_BED = new TriggerWrapper<>("slept_in_bed", SleptInBed.class);

    public static final TriggerWrapper<SlideDownBlock> SLIDE_DOWN_BLOCK = new TriggerWrapper<>("slide_down_block", SlideDownBlock.class);

    public static final TriggerWrapper<SummonedEntity> SUMMONED_ENTITY = new TriggerWrapper<>("summoned_entity", SummonedEntity.class);

    public static final TriggerWrapper<TameAnimal> TAME_ANIMAL = new TriggerWrapper<>("tame_animal", TameAnimal.class);

    public static final TriggerWrapper<TargetHit> TARGET_HIT = new TriggerWrapper<>("target_hit", TargetHit.class);

    public static final TriggerWrapper<ThrownItemPickedUpByEntity> THROWN_ITEM_PICKED_UP_BY_ENTITY = new TriggerWrapper<>("throw_item_picked_up_by_entity", ThrownItemPickedUpByEntity.class);

    public static final TriggerWrapper<Tick> TICK = new TriggerWrapper<>("tick", Tick.class);

    public static final TriggerWrapper<UsedEnderEye> USED_ENDER_EYE = new TriggerWrapper<>("used_ender_eye", UsedEnderEye.class);

    public static final TriggerWrapper<UsedTotem> USED_TOTEM = new TriggerWrapper<>("used_totem", UsedTotem.class);

    public static final TriggerWrapper<VillagerTrade> VILLAGER_TRADE = new TriggerWrapper<>("villager_trade", VillagerTrade.class);

    public static final TriggerWrapper<VoluntaryExile> VOLUNTARY_EXILE = new TriggerWrapper<>("voluntary_exile", VoluntaryExile.class);

    private TriggerType() {

    }

}
