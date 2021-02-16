package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.bukkit.GameMode;
import java.lang.reflect.Type;

public class GameModeAdapter implements JsonSerializer<GameMode> {

    @Override
    public JsonElement serialize(GameMode src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.name().toLowerCase());
    }

}
