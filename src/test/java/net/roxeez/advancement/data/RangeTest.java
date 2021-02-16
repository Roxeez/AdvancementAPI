package net.roxeez.advancement.data;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Range tests")
public class RangeTest extends DataTest<Range<Integer>> {

    @Override
    protected Range<Integer> getObject() {
        return new Range<>(10, 10);
    }

    @Override
    protected String getJson() {
        return "{\"min\":10,\"max\":10}";
    }

}
