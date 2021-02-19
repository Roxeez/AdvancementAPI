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
        return entity;
    }

    @Override
    protected String getJson() {
        return "{\n" +
                "  \"type\": \"minecraft:cow\"\n" +
                "}";
    }

}
