package net.roxeez.advancement.common;

import net.roxeez.advancement.SerializerTest;
import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;


@DisplayName("Item tests")
public class ItemTest extends SerializerTest<Item> {

    @Override
    protected Item getObject() {
        Item item = new Item();

        item.setType(Material.BEDROCK);
        item.setCount(10, 15);

        return item;
    }

    @Override
    protected String getJson() {
        return "{\"item\":\"minecraft:bedrock\",\"count\":{\"min\":10,\"max\":15}}";
    }

}
