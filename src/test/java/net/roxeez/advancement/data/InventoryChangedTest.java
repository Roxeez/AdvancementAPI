package net.roxeez.advancement.data;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Material;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("InventoryChanged tests")
public class InventoryChangedDataTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if InventoryChanged is correctly serialized")
    public void serialization() {
        InventoryChangedData object = new InventoryChangedData();

        object.hasItem(Material.BEDROCK);
        object.hasItemMatching(item -> {
            item.is(Material.IRON_ORE);
            item.count(1, 10);
        });

        String serialized = serializer.serialize(object);
        Assertions.assertEquals("{\n" +
                                        "  \"items\": [\n" +
                                        "    {\n" +
                                        "      \"item\": \"minecraft:bedrock\"\n" +
                                        "    },\n" +
                                        "    {\n" +
                                        "      \"item\": \"minecraft:iron_ore\",\n" +
                                        "      \"count\": {\n" +
                                        "        \"min\": 1,\n" +
                                        "        \"max\": 10\n" +
                                        "      }\n" +
                                        "    }\n" +
                                        "  ]\n" +
                                        "}", serialized);
    }

}
