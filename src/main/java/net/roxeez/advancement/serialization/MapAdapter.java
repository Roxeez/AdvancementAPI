package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

public class MapAdapter implements JsonSerializer<Map<?, ?>> {

    @Override
    public JsonElement serialize(Map<?, ?> src, Type typeOfSrc, JsonSerializationContext context) {
        if (src == null || src.isEmpty())
            return null;

        JsonObject object = new JsonObject();

        for (Map.Entry<?, ?> child : src.entrySet()) {
            JsonElement key = context.serialize(child.getKey());
            JsonElement value = context.serialize(child.getValue());

            object.add(key.getAsString(), value);
        }

        return object;
    }

}
