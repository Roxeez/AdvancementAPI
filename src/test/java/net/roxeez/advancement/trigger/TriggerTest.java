package net.roxeez.advancement.trigger;

import net.roxeez.advancement.Criteria;
import net.roxeez.advancement.data.DataTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class TriggerTest<T extends Trigger> extends DataTest<T> {

    protected abstract TriggerWrapper<T> getTrigger();

    @Test
    @DisplayName("Check if trigger data match")
    public void trigger() {
        Assertions.assertEquals(getObject().getClass(), getTrigger().getClazz());
    }

    @Test
    @DisplayName("Check if criteria is correctly serialized")
    public void criteria() {
        String serialized = serializer.serialize(new Criteria("test", getTrigger(), getObject()));
        Assertions.assertEquals("{\"trigger\":\"" + getTrigger().getKey().toString() + "\",\"conditions\":" + getJson() + "}", serialized);
    }

}
