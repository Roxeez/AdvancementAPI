package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.roxeez.advancement.utility.KeyValue;
import java.lang.reflect.Type;

public class KeyValueAdapter implements JsonSerializer<KeyValue<?, ?>> {

    @Override
    public JsonElement serialize(KeyValue<?, ?> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.add(context.serialize(src.getKey()).getAsString(), context.serialize(src.getValue()));
        return object;
    }

}
