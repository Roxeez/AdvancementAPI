package net.roxeez.advancement.trigger;

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
        return "{\"items\":[{\"item\":\"minecraft:bedrock\"},{\"item\":\"minecraft:iron_ore\",\"count\":{\"min\":1,\"max\":10}}]}";
    }

}
