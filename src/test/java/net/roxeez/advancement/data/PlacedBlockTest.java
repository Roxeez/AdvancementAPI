package net.roxeez.advancement.data;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Material;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("PlacedBlock tests")
public class PlacedBlockDataTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if PlacedBlock is correctly serialized")
    public void serialization() {
        PlacedBlockData object = new PlacedBlockData();

        object.block(Material.BEDROCK);

        String serialized = serializer.serialize(object);
        Assertions.assertEquals("{\n" +
                                        "  \"block\": \"minecraft:bedrock\"\n" +
                                        "}", serialized);
    }

}
