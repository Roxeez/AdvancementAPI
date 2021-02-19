package net.roxeez.advancement.trigger;

import net.roxeez.advancement.data.EffectType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("EffectsChanged tests")
public class EffectsChangedTest extends TriggerTest<EffectsChanged> {

    @Override
    protected EffectsChanged getObject() {
        EffectsChanged object = new EffectsChanged();

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
    protected TriggerWrapper<EffectsChanged> getTrigger() {
        return TriggerType.EFFECTS_CHANGED;
    }

}
