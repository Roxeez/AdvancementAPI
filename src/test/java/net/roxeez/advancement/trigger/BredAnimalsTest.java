package net.roxeez.advancement.trigger;

import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BredAnimals tests")
public class BredAnimalsTest extends TriggerTest<BredAnimalsData> {

    @Override
    protected Trigger<BredAnimalsData> getTrigger() {
        return TriggerType.BRED_ANIMALS;
    }

    @Override
    protected BredAnimalsData getObject() {
        BredAnimalsData object = new BredAnimalsData();

        object.setParent(EntityType.COW);
        object.setPartner(EntityType.COW);
        object.setChild(EntityType.MUSHROOM_COW);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"child\":{\"type\":\"minecraft:mooshroom\"},\"parent\":{\"type\":\"minecraft:cow\"},\"partner\":{\"type\":\"minecraft:cow\"}}";
    }

}
