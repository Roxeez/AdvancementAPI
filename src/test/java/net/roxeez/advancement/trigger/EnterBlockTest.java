package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("EnterBlocck tests")
public class EnterBlockTest extends TriggerTest<EnterBlockData> {

    @Override
    protected EnterBlockData getObject() {
        EnterBlockData object = new EnterBlockData();
        object.setBlock(Material.ROSE_BUSH);
        object.setState("half", "lower");
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"block\":\"minecraft:rose_bush\",\"state\":{\"\\\"half\\\"\":\"lower\"}}";
    }

    @Override
    protected Trigger<EnterBlockData> getTrigger() {
        return TriggerType.ENTER_BLOCK;
    }

}
