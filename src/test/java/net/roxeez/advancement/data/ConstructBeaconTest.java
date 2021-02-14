package net.roxeez.advancement.data;

import net.roxeez.advancement.trigger.Trigger;
import net.roxeez.advancement.trigger.TriggerType;

public class ConstructBeaconTest extends TriggerTest<ConstructBeaconData> {

    @Override
    protected ConstructBeaconData getObject() {
        ConstructBeaconData object = new ConstructBeaconData();

        object.level(3);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"level\":{\"min\":3}}";
    }

    @Override
    protected Trigger<ConstructBeaconData> getTrigger() {
        return TriggerType.CONSTRUCT_BEACON;
    }

}
