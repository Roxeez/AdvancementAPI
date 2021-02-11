package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.roxeez.advancement.common.Potion;
import java.lang.reflect.Type;

public class PotionAdapter implements JsonSerializer<Potion> {

    @Override
    public JsonElement serialize(Potion src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getKey().toString());
    }

}
