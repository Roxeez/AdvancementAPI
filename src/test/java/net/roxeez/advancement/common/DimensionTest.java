package net.roxeez.advancement.common;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Dimension tests")
public class DimensionTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if all dimension are serialized using dimension name")
    public void serialization() {
        for(Dimension dimension : Dimension.values()) {
            Assertions.assertEquals("\"" + dimension.getName() + "\"", serializer.serialize(dimension));
        }
    }

    @Test
    @DisplayName("Check if Dimension#getByName return correct value")
    public void getByNameShouldReturnCorrectDimension() {
        Assertions.assertEquals(Dimension.getByName("the_end"), Dimension.THE_END);
    }

}
