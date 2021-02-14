package net.roxeez.advancement.common;

import net.roxeez.advancement.SerializerTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Potion tests")
public class PotionTest extends SerializerTest<Potion> {

    @Override
    protected Potion getObject() {
        return Potion.HARMING_II;
    }

    @Override
    protected String getJson() {
        return "\"minecraft:strong_harming\"";
    }

    @Test
    @DisplayName("Check if Potion#getByName return correct value")
    public void getByNameShouldReturnCorrectPotion() {
        Assertions.assertEquals(Potion.getByName("strong_healing"), Potion.INSTANT_HEALTH_II);
    }

}
