package net.roxeez.advancement.data;

import net.roxeez.advancement.SerializerTest;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Entity tests")
public class EntityTest extends SerializerTest<EntityData> {

    @Override
    protected EntityData getObject() {
        EntityData entity = new EntityData();

        entity.setType(EntityType.BAT);

        return entity;
    }

    @Override
    protected String getJson() {
        return "{\"type\":\"minecraft:bat\"}";
    }

}
