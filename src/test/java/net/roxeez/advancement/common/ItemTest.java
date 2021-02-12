package net.roxeez.advancement.common;

import com.google.gson.Gson;
import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Material;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    public void serialization() {
        Item item = new Item();

        item.is(Material.BEDROCK);
        item.count(10, 15);

        String serialized = serializer.serialize(item);
        assertEquals("{\n" +
                             "  \"item\": \"minecraft:bedrock\",\n" +
                             "  \"count\": {\n" +
                             "    \"min\": 10,\n" +
                             "    \"max\": 15\n" +
                             "  }\n" +
                             "}", serialized);
    }

}
