package net.roxeez.advancement.trigger;

import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BredAnimals tests")
public class BredAnimalsTest extends TriggerTest<BredAnimals> {

    @Override
    protected Trigger<BredAnimals> getTrigger() {
        return TriggerType.BRED_ANIMALS;
    }

    @Override
    protected BredAnimals getObject() {
        BredAnimals object = new BredAnimals();

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
