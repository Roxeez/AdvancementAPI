package net.roxeez.advancement.trigger;

public class ConstructBeaconTest extends TriggerTest<ConstructBeaconData> {

    @Override
    protected ConstructBeaconData getObject() {
        ConstructBeaconData object = new ConstructBeaconData();

        object.setLevel(3);

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
