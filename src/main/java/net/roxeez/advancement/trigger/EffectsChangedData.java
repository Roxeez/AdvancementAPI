package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.common.Effect;
import net.roxeez.advancement.common.EffectType;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#EFFECTS_CHANGED}
 */
public class EffectsChangedData implements TriggerData {

    @Expose
    @SerializedName("effects")
    private Map<EffectType, Effect> effects;

    /**
     * Add effect to required effects
     *
     * @param effectType Type of effect
     * @param consumer Modifiers of effect
     */
    public void addEffect(EffectType effectType, Consumer<Effect> consumer) {
        if (this.effects == null) {
            this.effects = new HashMap<>();
        }

        Effect effect = new Effect();
        consumer.accept(effect);

        this.effects.put(effectType, effect);
    }

}
