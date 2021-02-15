package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.roxeez.advancement.data.PotionType;
import java.lang.reflect.Type;

public class PotionTypeAdapter implements JsonSerializer<PotionType> {

    @Override
    public JsonElement serialize(PotionType src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getKey().toString());
    }

}
