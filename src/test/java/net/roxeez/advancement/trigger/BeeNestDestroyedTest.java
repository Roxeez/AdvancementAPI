package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BeeNestDestroyed trigger tests")
public class BeeNestDestroyedTest extends TriggerTest<BeeNestDestroyed> {

    @Override
    protected TriggerWrapper<BeeNestDestroyed> getTrigger() {
        return TriggerType.BEE_NEST_DESTROYED;
    }

    @Override
    protected BeeNestDestroyed getObject() {
        BeeNestDestroyed object = new BeeNestDestroyed();

        object.setBlock(Material.BEEHIVE);
        object.withItem(Material.WOODEN_AXE);
        object.withBeeCount(3);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"block\":\"minecraft:beehive\",\"item\":{\"item\":\"minecraft:wooden_axe\"},\"numBeesInside\":3}";
    }

}
