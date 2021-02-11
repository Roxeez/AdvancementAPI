package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.bukkit.Material;
import java.lang.reflect.Type;

public class MaterialAdapter implements JsonSerializer<Material> {

    @Override
    public JsonElement serialize(Material src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getKey().toString());
    }

}
