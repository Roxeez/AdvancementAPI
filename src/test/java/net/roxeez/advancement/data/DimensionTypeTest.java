package net.roxeez.advancement.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("DimensionType tests")
public class DimensionTypeTest extends DataTest<DimensionType> {

    @Override
    protected DimensionType getObject() {
        return DimensionType.OVERWORLD;
    }

    @Override
    protected String getJson() {
        return "\"overworld\"";
    }

    @Test
    @DisplayName("Check if DimensionType#getByName return correct value")
    public void getByNameShouldReturnCorrectDimension() {
        Assertions.assertEquals(DimensionType.getByName("the_end"), DimensionType.THE_END);
    }

}
