package net.roxeez.advancement.trigger;

import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("ChanneledLightning tests")
public class ChanneledLightningTest extends TriggerTest<ChanneledLightning> {

    @Override
    protected TriggerWrapper<ChanneledLightning> getTrigger() {
        return TriggerType.CHANNELED_LIGHTNING;
    }

    @Override
    protected ChanneledLightning getObject() {
        ChanneledLightning object = new ChanneledLightning();

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
