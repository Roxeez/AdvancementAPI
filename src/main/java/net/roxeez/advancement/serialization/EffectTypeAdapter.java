package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.roxeez.advancement.data.EffectType;
import java.lang.reflect.Type;

public class EffectTypeAdapter implements JsonSerializer<EffectType> {

    @Override
    public JsonElement serialize(EffectType src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getKey().toString());
    }

}
