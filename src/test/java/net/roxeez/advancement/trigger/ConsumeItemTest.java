package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("ConsumeItem tests")
public class ConsumeItemTest extends TriggerTest<ConsumeItem> {

    @Override
    protected ConsumeItem getObject() {
        ConsumeItem object = new ConsumeItem();

        object.setItem(Material.MELON);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"item\":{\"item\":\"minecraft:melon\"}}";
    }

    @Override
    protected TriggerWrapper<ConsumeItem> getTrigger() {
        return TriggerType.CONSUME_ITEM;
    }

}
