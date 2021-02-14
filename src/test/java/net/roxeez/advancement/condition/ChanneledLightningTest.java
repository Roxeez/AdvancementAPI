package net.roxeez.advancement.condition;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ChanneledLightning tests")
public class ChanneledLightningTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if ChanneledLightning is correctly serialized")
    public void serialization() {
        ChanneledLightning object = new ChanneledLightning();

        object.addVictim(EntityType.BAT);
        object.addVictim(EntityType.CHICKEN);
        object.addVictim(EntityType.BEE);

        String serialized = serializer.serialize(object);
        Assertions.assertEquals("{\n" +
                                        "  \"victims\": [\n" +
                                        "    {\n" +
                                        "      \"type\": \"minecraft:bat\"\n" +
                                        "    },\n" +
                                        "    {\n" +
                                        "      \"type\": \"minecraft:chicken\"\n" +
                                        "    },\n" +
                                        "    {\n" +
                                        "      \"type\": \"minecraft:bee\"\n" +
                                        "    }\n" +
                                        "  ]\n" +
                                        "}", serialized);
    }

}
