package net.roxeez.advancement.condition;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.common.Potion;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BrewedPotion tests")
public class BrewedPotionTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if BrewedPotion is correctly serialized")
    public void serialization() {
        BrewedPotion object = new BrewedPotion();

        object.potion(Potion.LUCK);

        String serialized = serializer.serialize(object);
        Assertions.assertEquals("{\n" +
                                        "  \"potion\": \"minecraft:luck\"\n" +
                                        "}", serialized);
    }

}
