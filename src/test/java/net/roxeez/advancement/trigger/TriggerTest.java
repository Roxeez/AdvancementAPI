package net.roxeez.advancement.trigger;

import net.roxeez.advancement.Criteria;
import net.roxeez.advancement.data.DataTest;
import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public abstract class TriggerTest<T extends Trigger> extends DataTest<T> {

    protected abstract TriggerWrapper<T> getTrigger();

    @Test
    @DisplayName("Check if trigger data match")
    public void trigger() {
        Assertions.assertEquals(getObject().getClass(), getTrigger().getClazz());
    }

    @Test
    @DisplayName("Check if criteria is correctly serialized")
    public void criteria() throws JSONException {
        String serialized = serializer.serialize(new Criteria("example", getTrigger(), getObject()));
        System.out.println(serialized);
        JSONAssert.assertEquals("{\"trigger\":\"" + getTrigger().getKey().toString() + "\",\"conditions\":" + getJson() + "}", serialized, true);
    }

}
