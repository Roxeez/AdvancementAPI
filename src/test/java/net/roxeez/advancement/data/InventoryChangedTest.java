package net.roxeez.advancement.data;

import net.roxeez.advancement.trigger.Trigger;
import net.roxeez.advancement.trigger.TriggerType;
import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("InventoryChanged tests")
public class InventoryChangedTest extends TriggerTest<InventoryChangedData> {

    @Override
    protected Trigger<InventoryChangedData> getTrigger() {
        return TriggerType.INVENTORY_CHANGED;
    }

    @Override
    protected InventoryChangedData getObject() {
        InventoryChangedData object = new InventoryChangedData();

        object.hasItem(Material.BEDROCK);
        object.hasItemMatching(item -> {
            item.is(Material.IRON_ORE);
            item.count(1, 10);
        });

        return object;
    }

    @Override
    protected String getJson() {
        return "{\n" +
                "  \"items\": [\n" +
                "    {\n" +
                "      \"item\": \"minecraft:bedrock\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"item\": \"minecraft:iron_ore\",\n" +
                "      \"count\": {\n" +
                "        \"min\": 1,\n" +
                "        \"max\": 10\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

}
