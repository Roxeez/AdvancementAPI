package net.roxeez.advancement.common;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Material;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Item tests")
public class ItemTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if all values of Item are correctly serialized")
    public void serialization() {
        Item item = new Item();

        item.is(Material.BEDROCK);
        item.count(10, 15);

        String serialized = serializer.serialize(item);
        Assertions.assertEquals("{\n" +
                             "  \"item\": \"minecraft:bedrock\",\n" +
                             "  \"count\": {\n" +
                             "    \"min\": 10,\n" +
                             "    \"max\": 15\n" +
                             "  }\n" +
                             "}", serialized);
    }

}
