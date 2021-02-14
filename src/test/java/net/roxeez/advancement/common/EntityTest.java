package net.roxeez.advancement.common;

import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Entity tests")
public class EntityTest {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if all values of Entity are correctly serialized")
    public void serialization() {
        Entity entity = new Entity();

        entity.is(EntityType.BAT);

        String serialized = serializer.serialize(entity);
        Assertions.assertEquals("{\n" +
                             "  \"type\": \"minecraft:bat\"\n" +
                             "}", serialized);
    }

}
