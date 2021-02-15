package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.roxeez.advancement.data.DimensionType;
import java.lang.reflect.Type;

public class DimensionTypeAdapter implements JsonSerializer<DimensionType> {

    @Override
    public JsonElement serialize(DimensionType src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getName());
    }

}
