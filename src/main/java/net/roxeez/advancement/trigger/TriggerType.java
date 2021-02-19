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

    /**
     * Triggers after a player gets hurt. It also triggers after player hurts without a source entity
     */
    public static final TriggerWrapper<EntityHurtPlayer> ENTITY_HURT_PLAYER = new TriggerWrapper<>("entity_hurt_player", EntityHurtPlayer.class);

    /**
     * Triggers after an entity kills a player
     */
    public static final TriggerWrapper<EntityKilledPlayer> ENTITY_KILLED_PLAYER = new TriggerWrapper<>("entity_killed_player", EntityKilledPlayer.class);

    /**
     * Triggers after the player fills a bucket
     */
    public static final TriggerWrapper<FilledBucket> FILLED_BUCKET = new TriggerWrapper<>("filled_bucket", FilledBucket.class);

    /**
     * Triggers after the player successfully catches an item with a fishing rod or pulls an entity with a fishing rod
     */
    public static final TriggerWrapper<FishingRodHooked> FISHING_ROD_HOOKED = new TriggerWrapper<>("fishing_rod_hooked", FishingRodHooked.class);

    /**
     * Triggers when the player defeats a raid and checks where the player is
     */
    public static final TriggerWrapper<HeroOfTheVillage> HERO_OF_THE_VILLAGE = new TriggerWrapper<>("hero_of_the_village", HeroOfTheVillage.class);

    /**
     * Triggers only using commands
     */
    public static final TriggerWrapper<Impossible> IMPOSSIBLE = new TriggerWrapper<>("impossible", Impossible.class);

    /**
     * Triggers after any item in the inventory has been damaged in any form
     */
    public static final TriggerWrapper<ItemDurabilityChanged> ITEM_DURABILITY_CHANGED = new TriggerWrapper<>("item_durability_changed", ItemDurabilityChanged.class);

    /**
     * Triggers when the player uses their hand or an item on a block
     */
    public static final TriggerWrapper<ItemUsedOnBlock> ITEM_USED_ON_BLOCK = new TriggerWrapper<>("item_used_on_block", ItemUsedOnBlock.class);

    /**
     * Triggers after the player kills a mob or player using a crossbow in ranged combat
     */
    public static final TriggerWrapper<KilledByCrossbow> KILLED_BY_CROSSBOW = new TriggerWrapper<>("killed_by_crossbow", KilledByCrossbow.class);

    /**
     * Triggers when the player has the levitation status effect
     */
    public static final TriggerWrapper<Levitation> LEVITATION = new TriggerWrapper<>("levitation", Levitation.class);

    /**
     * Triggers every 20 ticks (1 second) and checks where the player is
     */
    public static final TriggerWrapper<Location> LOCATION = new TriggerWrapper<>("location", Location.class);

    /**
     * Triggers when the player travels to the Nether and then returns to the Overworld
     */
    public static final TriggerWrapper<NetherTravel> NETHER_TRAVEL = new TriggerWrapper<>("nether_travel", NetherTravel.class);

    /**
     * Triggers when the player generates the contents of a container with a loot table set
     */
    public static final TriggerWrapper<PlayerGeneratesContainerLoot> PLAYER_GENERATES_CONTAINER_LOOT = new TriggerWrapper<>("player_generates_container_loot", PlayerGeneratesContainerLoot.class);

    /**
     * Triggers after the player hurts a mob or player
     */
    public static final TriggerWrapper<PlayerHurtEntity> PLAYER_HURT_ENTITY = new TriggerWrapper<>("player_hurt_entity", PlayerHurtEntity.class);

    /**
     * Triggers when the player interacts with an entity
     */
    public static final TriggerWrapper<PlayerInteractedWithEntity> PLAYER_INTERACTED_WITH_ENTITY = new TriggerWrapper<>("player_interacted_with_entity", PlayerInteractedWithEntity.class);

    /**
     * Triggers after a player is the source of a mob or player being killed
     */
    public static final TriggerWrapper<PlayerKilledEntity> PLAYER_KILLED_ENTITY = new TriggerWrapper<>("player_killed_entity", PlayerKilledEntity.class);

    /**
     * Triggers after the player unlocks a recipe (using a knowledge book for example)
     */
    public static final TriggerWrapper<RecipeUnlocked> RECIPE_UNLOCKED = new TriggerWrapper<>("recipe_unlocked", RecipeUnlocked.class);

    /**
     * Triggers when the player shoots a crossbow
     */
    public static final TriggerWrapper<ShotCrossbow> SHOT_CROSSBOW = new TriggerWrapper<>("short_crossbow", ShotCrossbow.class);

    /**
     * Triggers when the player enters a bed
     */
    public static final TriggerWrapper<SleptInBed> SLEPT_IN_BED = new TriggerWrapper<>("slept_in_bed", SleptInBed.class);

    /**
     * Triggers when the player slides down a block
     */
    public static final TriggerWrapper<SlideDownBlock> SLIDE_DOWN_BLOCK = new TriggerWrapper<>("slide_down_block", SlideDownBlock.class);

    /**
     * Triggers after an entity has been summoned. Works with iron golems (pumpkin and iron blocks), snow golems (pumpkin and snow blocks), the ender dragon (end crystals) and the wither (wither skulls and soul sand/soul soil). Using dispensers to place the wither skulls or pumpkins will still activate this trigger.
     * Spawn eggs, commands and mob spawners will not work however
     */
    public static final TriggerWrapper<SummonedEntity> SUMMONED_ENTITY = new TriggerWrapper<>("summoned_entity", SummonedEntity.class);

    /**
     * Triggers after the player tames an animal
     */
    public static final TriggerWrapper<TameAnimal> TAME_ANIMAL = new TriggerWrapper<>("tame_animal", TameAnimal.class);

    /**
     * Triggers when the player shoots a target block
     */
    public static final TriggerWrapper<TargetHit> TARGET_HIT = new TriggerWrapper<>("target_hit", TargetHit.class);

    /**
     * Triggers after the player throws an item and another entity picks it up
     */
    public static final TriggerWrapper<ThrownItemPickedUpByEntity> THROWN_ITEM_PICKED_UP_BY_ENTITY = new TriggerWrapper<>("throw_item_picked_up_by_entity", ThrownItemPickedUpByEntity.class);

    /**
     * Triggers every tick (20 times a second)
     */
    public static final TriggerWrapper<Tick> TICK = new TriggerWrapper<>("tick", Tick.class);

    /**
     * Triggers when the player uses an eye of ender (in a world where strongholds generate)
     */
    public static final TriggerWrapper<UsedEnderEye> USED_ENDER_EYE = new TriggerWrapper<>("used_ender_eye", UsedEnderEye.class);

    /**
     * Triggers when the player uses a totem
     */
    public static final TriggerWrapper<UsedTotem> USED_TOTEM = new TriggerWrapper<>("used_totem", UsedTotem.class);

    /**
     * Triggers after the player trades with a villager or a wandering trader
     */
    public static final TriggerWrapper<VillagerTrade> VILLAGER_TRADE = new TriggerWrapper<>("villager_trade", VillagerTrade.class);

    /**
     * Triggers when the player causes a raid and checks where the player is
     */
    public static final TriggerWrapper<VoluntaryExile> VOLUNTARY_EXILE = new TriggerWrapper<>("voluntary_exile", VoluntaryExile.class);

    private TriggerType() {

    }

}
