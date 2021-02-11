package net.roxeez.advancement.condition;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.achievy.advancement.condition.common.PotionType;
import net.roxeez.achievy.advancement.trigger.TriggerType;
import org.jetbrains.annotations.NotNull;

/**
 * Conditions used by {@link TriggerType#BREWED_POTION}
 */
public class BrewedPotion implements Conditions {

    @Expose
    @SerializedName("potion")
    private PotionType potion;

    /**
     * Set required potion type to trigger
     *
     * @param type Type of the potion
     */
    public void potion(@NotNull PotionType type) {
        Preconditions.checkNotNull(type);
        potion = type;
    }

}
