package net.roxeez.advancement.trigger;

import net.roxeez.advancement.data.DimensionType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("ChangedDimension tests")
public class ChangedDimensionTest extends TriggerTest<ChangedDimension> {

    @Override
    protected TriggerWrapper<ChangedDimension> getTrigger() {
        return TriggerType.CHANGED_DIMENSION;
    }

    @Override
    protected ChangedDimension getObject() {
        ChangedDimension object = new ChangedDimension();

        object.setFrom(DimensionType.THE_END);
        object.setTo(DimensionType.OVERWORLD);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"from\":\"minecraft:the_end\",\"to\":\"minecraft:overworld\"}";
    }

}
