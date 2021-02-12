package net.roxeez.advancement.common;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotionTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    public void serialization() {
        for(Potion potion : Potion.values()) {
            assertEquals("\""+ potion.getKey().toString() + "\"", serializer.serialize(potion));
        }
    }

    @Test
    public void potion_get_name_should_return_correct_value() {
        assertEquals(Potion.getByName("strong_healing"), Potion.INSTANT_HEALTH_II);
    }

}
