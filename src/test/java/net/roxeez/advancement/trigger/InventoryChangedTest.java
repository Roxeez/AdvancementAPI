package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("InventoryChanged tests")
public class InventoryChangedTest extends TriggerTest<InventoryChanged> {

    @Override
    protected TriggerWrapper<InventoryChanged> getTrigger() {
        return TriggerType.INVENTORY_CHANGED;
    }

    @Override
    protected InventoryChanged getObject() {
        InventoryChanged object = new InventoryChanged();

        object.hasItem(Material.BEDROCK);
        object.hasItemMatching(item -> {
            item.setType(Material.IRON_ORE);
            item.setCount(1, 10);
        });

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"items\":[{\"item\":\"minecraft:bedrock\"},{\"item\":\"minecraft:iron_ore\",\"count\":{\"min\":1,\"max\":10}}]}";
    }

}
