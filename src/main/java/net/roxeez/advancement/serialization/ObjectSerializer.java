package net.roxeez.advancement.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.util.Pair;
import net.roxeez.advancement.data.DimensionType;
import net.roxeez.advancement.data.EffectType;
import net.roxeez.advancement.data.PotionType;
import net.roxeez.advancement.display.FrameType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import java.util.List;
import java.util.Map;

public class ObjectSerializer {

    private static final Gson GSON = new GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .registerTypeHierarchyAdapter(Material.class, new MaterialAdapter())
            .registerTypeHierarchyAdapter(EntityType.class, new EntityTypeAdapter())
            .registerTypeHierarchyAdapter(PotionType.class, new PotionTypeAdapter())
            .registerTypeHierarchyAdapter(DimensionType.class, new DimensionTypeAdapter())
            .registerTypeHierarchyAdapter(NamespacedKey.class, new NamespacedKeyAdapter())
            .registerTypeHierarchyAdapter(List.class, new ListAdapter())
            .registerTypeHierarchyAdapter(FrameType.class, new FrameTypeAdapter())
            .registerTypeHierarchyAdapter(Map.class, new MapAdapter())
            .registerTypeHierarchyAdapter(EffectType.class, new EffectTypeAdapter())
            .registerTypeHierarchyAdapter(Pair.class, new PairAdapter())
            .create();

    public String serialize(Object object) {
        return GSON.toJson(object);
    }

}
