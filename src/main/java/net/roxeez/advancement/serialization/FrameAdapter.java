package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.roxeez.advancement.display.Frame;
import java.lang.reflect.Type;

public class FrameAdapter implements JsonSerializer<Frame> {

    @Override
    public JsonElement serialize(Frame src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getName());
    }

}
