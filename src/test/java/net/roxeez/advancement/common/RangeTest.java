package net.roxeez.advancement.common;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    public void serialization() {
        Range<Integer> range = new Range<>(10, 10);

        String serialized = serializer.serialize(range);

        assertEquals("{\n" +
                             "  \"min\": 10,\n" +
                             "  \"max\": 10\n" +
                             "}", serialized);
    }

}
