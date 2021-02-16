package net.roxeez.advancement.data;

import net.roxeez.advancement.SerializerTest;
import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;


@DisplayName("Item tests")
public class ItemTest extends SerializerTest<ItemData> {

    @Override
    protected ItemData getObject() {
        ItemData item = new ItemData();

        item.setType(Material.BEDROCK);
        item.setCount(10, 15);

        return item;
    }

    @Override
    protected String getJson() {
        return "{\"item\":\"minecraft:bedrock\",\"count\":{\"min\":10,\"max\":15}}";
    }

}
