package net.roxeez.advancement.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.roxeez.advancement.common.Dimension;
import net.roxeez.advancement.common.Potion;
import net.roxeez.advancement.display.Frame;
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
            .registerTypeHierarchyAdapter(Potion.class, new PotionAdapter())
            .registerTypeHierarchyAdapter(Dimension.class, new DimensionAdapter())
            .registerTypeHierarchyAdapter(NamespacedKey.class, new NamespacedKeyAdapter())
            .registerTypeHierarchyAdapter(List.class, new ListAdapter())
            .registerTypeHierarchyAdapter(Frame.class, new FrameAdapter())
            .registerTypeHierarchyAdapter(Map.class, new MapAdapter())
            .create();

    public String serialize(Object object) {
        return GSON.toJson(object);
    }

}
