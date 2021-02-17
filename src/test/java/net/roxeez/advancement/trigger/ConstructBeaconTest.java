package net.roxeez.advancement.trigger;

import org.junit.jupiter.api.DisplayName;

@DisplayName("ConstructBeacon tests")
public class ConstructBeaconTest extends TriggerTest<ConstructBeacon> {

    @Override
    protected ConstructBeacon getObject() {
        ConstructBeacon object = new ConstructBeacon();

        object.setLevel(3);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"level\":{\"min\":3}}";
    }

    @Override
    protected Trigger<ConstructBeacon> getTrigger() {
        return TriggerType.CONSTRUCT_BEACON;
    }

}
