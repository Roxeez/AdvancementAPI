package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("PlacedBlock tests")
public class PlacedBlockTest extends TriggerTest<PlacedBlock> {

    @Override
    protected Trigger<PlacedBlock> getTrigger() {
        return TriggerType.PLACED_BLOCK;
    }

    @Override
    protected PlacedBlock getObject() {
        PlacedBlock object = new PlacedBlock();

        object.setBlock(Material.BEDROCK);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"block\":\"minecraft:bedrock\"}";
    }

}
