package net.roxeez.advancement.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.roxeez.advancement.data.DimensionType;
import net.roxeez.advancement.data.EffectType;
import net.roxeez.advancement.data.PotionType;
import net.roxeez.advancement.display.FrameType;
import net.roxeez.advancement.utility.KeyValue;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.StructureType;
import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import java.util.List;
import java.util.Map;

public class ObjectSerializer {

    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
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
            .registerTypeHierarchyAdapter(KeyValue.class, new KeyValueAdapter())
            .registerTypeHierarchyAdapter(Biome.class, new BiomeAdapter())
            .registerTypeHierarchyAdapter(StructureType.class, new StructureTypeAdapter())
            .registerTypeHierarchyAdapter(GameMode.class, new GameModeAdapter())
            .create();

    public String serialize(Object object) {
        return GSON.toJson(object);
    }

}
