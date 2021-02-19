package net.roxeez.advancement.data;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public abstract class DataTest<T> extends TestBase {

    protected abstract T getObject();
    protected abstract String getJson();

    protected final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if data object is correctly serialized")
    public void serialization() throws JSONException {
        String serialized = serializer.serialize(getObject());
        System.out.println(serialized);
        JSONAssert.assertEquals(getJson(), serialized, true);
    }
}
