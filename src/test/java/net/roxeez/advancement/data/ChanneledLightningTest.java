package net.roxeez.advancement.data;

import net.roxeez.advancement.serialization.ObjectSerializer;
import net.roxeez.advancement.trigger.Trigger;
import net.roxeez.advancement.trigger.TriggerType;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("ChanneledLightning tests")
public class ChanneledLightningTest extends TriggerTest<ChanneledLightningData> {

    @Override
    protected Trigger<? extends TriggerData> getTrigger() {
        return TriggerType.CHANNELED_LIGHTNING;
    }

    @Override
    protected ChanneledLightningData getObject() {
        ChanneledLightningData object = new ChanneledLightningData();

        object.addVictim(EntityType.BAT);
        object.addVictim(EntityType.CHICKEN);
        object.addVictim(EntityType.BEE);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\n" +
                "  \"victims\": [\n" +
                "    {\n" +
                "      \"type\": \"minecraft:bat\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"minecraft:chicken\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"minecraft:bee\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }

}
