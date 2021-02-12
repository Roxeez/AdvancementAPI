package net.roxeez.advancement.common;

import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityTest {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    public void serialization() {
        Entity entity = new Entity();

        entity.is(EntityType.BAT);

        String serialized = serializer.serialize(entity);
        assertEquals("{\n" +
                             "  \"type\": \"minecraft:bat\"\n" +
                             "}", serialized);
    }

}
