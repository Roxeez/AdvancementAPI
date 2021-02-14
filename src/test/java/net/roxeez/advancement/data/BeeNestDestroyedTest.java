package net.roxeez.advancement.data;

import net.roxeez.advancement.trigger.Trigger;
import net.roxeez.advancement.trigger.TriggerType;
import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BeeNestDestroyed trigger tests")
public class BeeNestDestroyedTest extends TriggerTest<BeeNestDestroyedData> {

    @Override
    protected Trigger<BeeNestDestroyedData> getTrigger() {
        return TriggerType.BEE_NEST_DESTROYED;
    }

    @Override
    protected BeeNestDestroyedData getObject() {
        BeeNestDestroyedData object = new BeeNestDestroyedData();

        object.block(Material.BEE_NEST);
        object.withItem(Material.IRON_AXE);
        object.withBeeCount(3);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\n" +
                "  \"block\": \"minecraft:bee_nest\",\n" +
                "  \"item\": {\n" +
                "    \"item\": \"minecraft:iron_axe\"\n" +
                "  },\n" +
                "  \"numBeesInside\": 3\n" +
                "}";
    }

}
