package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.bukkit.block.Biome;
import java.lang.reflect.Type;

public class BiomeAdapter implements JsonSerializer<Biome> {

    @Override
    public JsonElement serialize(Biome src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getKey().toString());
    }

}
