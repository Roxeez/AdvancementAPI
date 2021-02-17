package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("EnterBlocck tests")
public class EnterBlockTest extends TriggerTest<EnterBlock> {

    @Override
    protected EnterBlock getObject() {
        EnterBlock object = new EnterBlock();
        object.setBlock(Material.ROSE_BUSH);
        object.setState("half", "lower");
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"block\":\"minecraft:rose_bush\",\"state\":{\"\\\"half\\\"\":\"lower\"}}";
    }

    @Override
    protected Trigger<EnterBlock> getTrigger() {
        return TriggerType.ENTER_BLOCK;
    }

}
