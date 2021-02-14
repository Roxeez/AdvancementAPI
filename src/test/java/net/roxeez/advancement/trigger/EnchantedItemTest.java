package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("EnchantedItem tests")
public class EnchantedItemTest extends TriggerTest<EnchantedItemData> {

    @Override
    protected EnchantedItemData getObject() {
        EnchantedItemData object = new EnchantedItemData();

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
    protected Trigger<EnchantedItemData> getTrigger() {
        return TriggerType.ENCHANTED_ITEM;
    }

}
