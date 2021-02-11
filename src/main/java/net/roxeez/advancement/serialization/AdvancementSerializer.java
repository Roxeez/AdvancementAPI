package net.roxeez.advancement.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.roxeez.advancement.Advancement;
import net.roxeez.advancement.condition.common.Dimension;
import net.roxeez.advancement.condition.common.Potion;
import net.roxeez.advancement.display.Frame;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import java.util.List;
import java.util.Map;

public class AdvancementSerializer {

    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
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

    public String serialize(Advancement advancement) {
        return GSON.toJson(advancement);
    }

}
