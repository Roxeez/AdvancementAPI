package net.roxeez.advancement.trigger;

public class ImpossibleTest extends TriggerTest<Impossible> {

    @Override
    protected Impossible getObject() {
        return new Impossible();
    }

    @Override
    protected String getJson() {
        return "{}";
    }

    @Override
    protected TriggerWrapper<Impossible> getTrigger() {
        return TriggerType.IMPOSSIBLE;
    }

}
