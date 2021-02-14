package net.roxeez.advancement.data;

import net.roxeez.advancement.trigger.Trigger;
import net.roxeez.advancement.trigger.TriggerType;
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

        object.parent(EntityType.COW);
        object.partner(EntityType.COW);
        object.child(EntityType.MUSHROOM_COW);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\n" +
                "  \"child\": {\n" +
                "    \"type\": \"minecraft:mooshroom\"\n" +
                "  },\n" +
                "  \"parent\": {\n" +
                "    \"type\": \"minecraft:cow\"\n" +
                "  },\n" +
                "  \"partner\": {\n" +
                "    \"type\": \"minecraft:cow\"\n" +
                "  }\n" +
                "}";
    }

}
