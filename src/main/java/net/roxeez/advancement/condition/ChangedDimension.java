package net.roxeez.advancement.condition;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.achievy.advancement.condition.common.DimensionType;
import net.roxeez.achievy.advancement.trigger.TriggerType;
import org.jetbrains.annotations.NotNull;

/**
 * Conditions used by {@link TriggerType#CHANGED_DIMENSION}
 */
public class ChangedDimension implements Conditions {

    @Expose
    @SerializedName("from")
    private DimensionType from;

    @Expose
    @SerializedName("to")
    private DimensionType to;

    /**
     * The dimension the entity traveled from
     *
     * @param type Type of dimension
     */
    public void from(@NotNull DimensionType type) {
        Preconditions.checkNotNull(type);
        this.from = type;
    }

    /**
     * The dimension the entity traveled to
     *
     * @param type Type of dimension
     */
    public void to(DimensionType type) {
        Preconditions.checkNotNull(type);
        this.to = type;
    }

}
