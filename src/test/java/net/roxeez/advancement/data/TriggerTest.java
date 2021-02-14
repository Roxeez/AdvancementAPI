package net.roxeez.advancement.data;

import net.roxeez.advancement.SerializerTest;
import net.roxeez.advancement.trigger.Trigger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class TriggerTest<T extends TriggerData> extends SerializerTest<T> {

    protected abstract Trigger<? extends TriggerData> getTrigger();

    @Test
    @DisplayName("Check if trigger data match")
    public void trigger() {
        Assertions.assertEquals(getObject().getClass(), getTrigger().getClazz());
    }

}
