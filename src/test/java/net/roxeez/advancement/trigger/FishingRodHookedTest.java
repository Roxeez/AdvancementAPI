package net.roxeez.advancement.trigger;

import org.bukkit.entity.EntityType;

public class FishingRodHookedTest extends TriggerTest<FishingRodHooked> {

    @Override
    protected FishingRodHooked getObject() {
        FishingRodHooked object = new FishingRodHooked();
        object.setRod(rod -> {
            rod.setDurability(10);
        });
        object.setEntity(entity -> {
            entity.setType(EntityType.TROPICAL_FISH);
        });
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"entity\":{\"type\":\"minecraft:tropical_fish\"},\"rod\":{\"durability\":{\"min\":10}}}";
    }

    @Override
    protected TriggerWrapper<FishingRodHooked> getTrigger() {
        return TriggerType.FISHING_ROD_HOOKED;
    }

}
