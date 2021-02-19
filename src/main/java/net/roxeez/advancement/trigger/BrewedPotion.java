package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.PotionType;
import org.jetbrains.annotations.NotNull;

public class BrewedPotion implements Trigger {

    @Expose
    @SerializedName("potion")
    private PotionType potion;

    /**
     * Set required potion type to trigger
     *
     * @param type Type of the potion
     */
    public void setPotion(@NotNull PotionType type) {
        Preconditions.checkNotNull(type);
        this.potion = type;
    }

}
