package net.roxeez.advancement.common;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Potion tests")
public class PotionTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if all potion are serialized using potion key")
    public void serialization() {
        for(Potion potion : Potion.values()) {
            Assertions.assertEquals("\""+ potion.getKey().toString() + "\"", serializer.serialize(potion));
        }
    }

    @Test
    @DisplayName("Check if Potion#getByName return correct value")
    public void getByNameShouldReturnCorrectPotion() {
        Assertions.assertEquals(Potion.getByName("strong_healing"), Potion.INSTANT_HEALTH_II);
    }

}
