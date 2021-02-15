package net.roxeez.advancement.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import javafx.util.Pair;
import java.lang.reflect.Type;

public class PairAdapter implements JsonSerializer<Pair<?, ?>> {

    @Override
    public JsonElement serialize(Pair<?, ?> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.add(context.serialize(src.getKey()).toString(), context.serialize(src.getValue()));
        return object;
    }

}
