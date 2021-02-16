package net.roxeez.advancement.data;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class DataTest<T> extends TestBase {

    protected abstract T getObject();
    protected abstract String getJson();

    protected final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if data object is correctly serialized")
    public void serialization() {
        String serialized = serializer.serialize(getObject());
        Assertions.assertEquals(getJson(), serialized);
    }
}
