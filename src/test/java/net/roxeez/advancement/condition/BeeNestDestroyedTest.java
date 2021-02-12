package net.roxeez.advancement.condition;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Material;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeeNestDestroyedTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    public void serialization() {
        BeeNestDestroyed object = new BeeNestDestroyed();

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
