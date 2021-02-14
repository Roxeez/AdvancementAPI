package net.roxeez.advancement.common;

import net.roxeez.advancement.SerializerTest;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Range tests")
public class RangeTest extends SerializerTest<Range<Integer>> {

    @Override
    protected Range<Integer> getObject() {
        return new Range<>(10, 10);
    }

    @Override
    protected String getJson() {
        return "{\"min\":10,\"max\":10}";
    }

}
