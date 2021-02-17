package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("EnchantedItem tests")
public class EnchantedItemTest extends TriggerTest<EnchantedItem> {

    @Override
    protected EnchantedItem getObject() {
        EnchantedItem object = new EnchantedItem();

        object.setItem(item -> {
            item.setType(Material.DIAMOND_SWORD);
        });
        object.setLevels(30);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"item\":{\"item\":\"minecraft:diamond_sword\"},\"levels\":{\"min\":30}}";
    }

    @Override
    protected Trigger<EnchantedItem> getTrigger() {
        return TriggerType.ENCHANTED_ITEM;
    }

}
