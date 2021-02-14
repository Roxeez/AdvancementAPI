package net.roxeez.advancement.data;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Material;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BeeNestDestroyed tests")
public class BeeNestDestroyedDataTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if BeeNestDestroyed is correctly serialized")
    public void serialization() {
        BeeNestDestroyedData object = new BeeNestDestroyedData();

        object.block(Material.BEE_NEST);
        object.withItem(Material.IRON_AXE);
        object.withBeeCount(3);

        String serialized = serializer.serialize(object);

        Assertions.assertEquals("{\n" +
                                        "  \"block\": \"minecraft:bee_nest\",\n" +
                                        "  \"item\": {\n" +
                                        "    \"item\": \"minecraft:iron_axe\"\n" +
                                        "  },\n" +
                                        "  \"numBeesInside\": 3\n" +
                                        "}", serialized);
    }

}
