package net.roxeez.advancement.trigger;

import net.roxeez.advancement.common.DimensionType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("ChangedDimension tests")
public class ChangedDimensionTest extends TriggerTest<ChangedDimensionData> {

    @Override
    protected Trigger<ChangedDimensionData> getTrigger() {
        return TriggerType.CHANGED_DIMENSION;
    }

    @Override
    protected ChangedDimensionData getObject() {
        ChangedDimensionData object = new ChangedDimensionData();

        object.setOrigin(DimensionType.OVERWORLD);
        object.setDestination(DimensionType.THE_NETHER);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"from\":\"overworld\",\"to\":\"the_nether\"}";
    }

}
