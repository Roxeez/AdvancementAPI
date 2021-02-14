package net.roxeez.advancement.common;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Range tests")
public class RangeTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if range is correctly serialized")
    public void serialization() {
        Range<Integer> range = new Range<>(10, 10);

        String serialized = serializer.serialize(range);

        Assertions.assertEquals("{\n" +
                             "  \"min\": 10,\n" +
                             "  \"max\": 10\n" +
                             "}", serialized);
    }

}
