package net.roxeez.advancement.data;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BredAnimals tests")
public class BredAnimalsDataTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if BredAnimals is correctly serialized")
    public void serialization() {
        BredAnimalsData object = new BredAnimalsData();

        object.parent(EntityType.COW);
        object.partner(EntityType.COW);
        object.child(EntityType.MUSHROOM_COW);

        String serialized = serializer.serialize(object);
        Assertions.assertEquals("{\n" +
                                        "  \"child\": {\n" +
                                        "    \"type\": \"minecraft:mooshroom\"\n" +
                                        "  },\n" +
                                        "  \"parent\": {\n" +
                                        "    \"type\": \"minecraft:cow\"\n" +
                                        "  },\n" +
                                        "  \"partner\": {\n" +
                                        "    \"type\": \"minecraft:cow\"\n" +
                                        "  }\n" +
                                        "}", serialized);
    }

}
