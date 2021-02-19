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

        object.setOrigin(DimensionType.OVERWORLD);
        object.setDestination(DimensionType.THE_NETHER);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"from\":\"overworld\",\"to\":\"the_nether\"}";
    }

}
