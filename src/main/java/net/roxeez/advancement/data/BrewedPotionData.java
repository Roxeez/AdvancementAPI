package net.roxeez.advancement.data;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.common.Potion;
import net.roxeez.advancement.trigger.TriggerType;
import org.jetbrains.annotations.NotNull;

/**
 * Data used by {@link TriggerType#BREWED_POTION}
 */
public class BrewedPotionData implements TriggerData {

    @Expose
    @SerializedName("potion")
    private Potion potion;

    /**
     * Set required potion type to trigger
     *
     * @param type Type of the potion
     */
    public void potion(@NotNull Potion type) {
        Preconditions.checkNotNull(type);
        potion = type;
    }

}
