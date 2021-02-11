package net.roxeez.advancement.common;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DimensionTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    public void dimension_serialization_should_return_name() {
        for(Dimension dimension : Dimension.values()) {
            assertEquals("\""+dimension.getName() + "\"", serializer.serialize(dimension));
        }
    }

    @Test
    public void dimension_get_name_should_return_correct_value() {
        assertEquals(Dimension.getByName("the_end"), Dimension.THE_END);
    }

}
