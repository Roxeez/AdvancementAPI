package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("PlacedBlock tests")
public class PlacedBlockTest extends TriggerTest<PlacedBlockData> {

    @Override
    protected Trigger<PlacedBlockData> getTrigger() {
        return TriggerType.PLACED_BLOCK;
    }

    @Override
    protected PlacedBlockData getObject() {
        PlacedBlockData object = new PlacedBlockData();

        object.block(Material.BEDROCK);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"block\":\"minecraft:bedrock\"}";
    }

}
