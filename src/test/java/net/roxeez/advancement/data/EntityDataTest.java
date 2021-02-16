package net.roxeez.advancement.data;

import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("EntityData tests")
public class EntityDataTest extends DataTest<EntityData> {

    @Override
    protected EntityData getObject() {
        EntityData entity = new EntityData();
        entity.setType(EntityType.COW);
        entity.setDistance(distance -> {
            distance.setHorizontal(10);
        });
        entity.setFlags(flags -> {
            flags.setBaby(true);
        });
        entity.setLocation(location -> {
            location.setBiome(Biome.BADLANDS);
            location.setPosition(position -> {
                position.setX(10);
            });
        });
        entity.addEffect(EffectType.GLOWING, effect -> {
            effect.setDuration(10);
        });
        return entity;
    }

    @Override
    protected String getJson() {
        return "{\"type\":\"minecraft:cow\",\"distance\":{\"horizontal\":{\"min\":10.0}},\"effects\":{\"\\\"minecraft:glowing\\\"\":{\"duration\":{\"min\":10}}},\"flags\":{\"is_on_fire\":false,\"is_sneaking\":false,\"is_sprinting\":false,\"is_swimming\":false,\"is_baby\":true},\"location\":{\"biome\":\"minecraft:badlands\",\"position\":{\"x\":{\"min\":10.0}},\"smokey\":false}}";
    }

}
