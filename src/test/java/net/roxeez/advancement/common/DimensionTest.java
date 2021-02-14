package net.roxeez.advancement.common;

import net.roxeez.advancement.SerializerTest;
import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Dimension tests")
public class DimensionTest extends SerializerTest<Dimension> {

    @Override
    protected Dimension getObject() {
        return Dimension.OVERWORLD;
    }

    @Override
    protected String getJson() {
        return "\"overworld\"";
    }

    @Test
    @DisplayName("Check if Dimension#getByName return correct value")
    public void getByNameShouldReturnCorrectDimension() {
        Assertions.assertEquals(Dimension.getByName("the_end"), Dimension.THE_END);
    }

}
