package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.bukkit.entity.EntityType;
import java.lang.reflect.Type;

public class EntityTypeAdapter implements JsonSerializer<EntityType> {

    @Override
    public JsonElement serialize(EntityType src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getKey().toString());
    }

}
