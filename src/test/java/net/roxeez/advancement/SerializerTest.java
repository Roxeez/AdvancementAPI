package net.roxeez.advancement;

import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class SerializerTest<T> extends TestBase {

    protected abstract T getObject();
    protected abstract String getJson();

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if object is correctly serialized")
    public void serialization() {
        String serialized = serializer.serialize(getObject());
        Assertions.assertEquals(getJson(), serialized);
    }
}
