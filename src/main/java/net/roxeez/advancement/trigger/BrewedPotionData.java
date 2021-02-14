package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.common.Potion;
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
    public void setPotion(@NotNull Potion type) {
        Preconditions.checkNotNull(type);
        this.potion = type;
    }

}
