package net.roxeez.advancement.data;

import net.roxeez.advancement.serialization.ObjectSerializer;
import net.roxeez.advancement.trigger.Trigger;
import net.roxeez.advancement.trigger.TriggerType;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("ChanneledLightning tests")
public class ChanneledLightningTest extends TriggerTest<ChanneledLightningData> {

    @Override
    protected Trigger<ChanneledLightningData> getTrigger() {
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
        return "{\"victims\":[{\"type\":\"minecraft:bat\"},{\"type\":\"minecraft:chicken\"},{\"type\":\"minecraft:bee\"}]}";
    }

}
