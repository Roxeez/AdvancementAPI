package net.roxeez.advancement.trigger;

import net.roxeez.advancement.common.Dimension;
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

        object.from(Dimension.OVERWORLD);
        object.to(Dimension.THE_NETHER);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"from\":\"overworld\",\"to\":\"the_nether\"}";
    }

}
