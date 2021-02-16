package net.roxeez.advancement.trigger;

public class ImpossibleTest extends TriggerTest<ImpossibleData> {

    @Override
    protected ImpossibleData getObject() {
        return new ImpossibleData();
    }

    @Override
    protected String getJson() {
        return "{}";
    }

    @Override
    protected Trigger<ImpossibleData> getTrigger() {
        return TriggerType.IMPOSSIBLE;
    }

}
