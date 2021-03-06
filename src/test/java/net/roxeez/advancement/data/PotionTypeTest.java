package net.roxeez.advancement.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("PotionType tests")
public class PotionTypeTest extends DataTest<PotionType> {

    @Override
    protected PotionType getObject() {
        return PotionType.HARMING_II;
    }

    @Override
    protected String getJson() {
        return "\"minecraft:strong_harming\"";
    }

    @Test
    @DisplayName("Check if PotionType#getByName return correct value")
    public void getByNameShouldReturnCorrectPotion() {
        Assertions.assertEquals(PotionType.getByName("strong_healing"), PotionType.INSTANT_HEALTH_II);
    }

}
