package net.roxeez.advancement.trigger;

import net.roxeez.advancement.common.EffectType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("EffectsChanged tests")
public class EffectsChangedTest extends TriggerTest<EffectsChangedData> {

    @Override
    protected EffectsChangedData getObject() {
        EffectsChangedData object = new EffectsChangedData();

        object.addEffect(EffectType.ABSORPTION, effect -> {
            effect.setDuration(1);
            effect.setAmplifier(1);
        });

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"effects\":{\"\\\"minecraft:absorption\\\"\":{\"amplifier\":{\"min\":1},\"duration\":{\"min\":1}}}}";
    }

    @Override
    protected Trigger<EffectsChangedData> getTrigger() {
        return TriggerType.EFFECTS_CHANGED;
    }

}
