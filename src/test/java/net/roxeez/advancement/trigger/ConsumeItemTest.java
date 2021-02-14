package net.roxeez.advancement.trigger;

import org.bukkit.Material;

public class ConsumeItemTest extends TriggerTest<ConsumeItemData> {

    @Override
    protected ConsumeItemData getObject() {
        ConsumeItemData object = new ConsumeItemData();

        object.setItem(Material.MELON);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"item\":{\"item\":\"minecraft:melon\"}}";
    }

    @Override
    protected Trigger<ConsumeItemData> getTrigger() {
        return TriggerType.CONSUME_ITEM;
    }

}
