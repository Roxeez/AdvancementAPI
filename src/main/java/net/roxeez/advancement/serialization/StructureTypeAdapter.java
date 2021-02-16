package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.bukkit.StructureType;
import java.lang.reflect.Type;

public class StructureTypeAdapter implements JsonSerializer<StructureType> {

    @Override
    public JsonElement serialize(StructureType src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getName());
    }

}
