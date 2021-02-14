package net.roxeez.advancement.data;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.common.Dimension;
import net.roxeez.advancement.trigger.TriggerType;
import org.jetbrains.annotations.NotNull;

/**
 * Data used by {@link TriggerType#CHANGED_DIMENSION}
 */
public class ChangedDimensionData implements TriggerData {

    @Expose
    @SerializedName("from")
    private Dimension from;

    @Expose
    @SerializedName("to")
    private Dimension to;

    /**
     * The dimension the entity traveled from
     *
     * @param type Type of dimension
     */
    public void from(@NotNull Dimension type) {
        Preconditions.checkNotNull(type);
        this.from = type;
    }

    /**
     * The dimension the entity traveled to
     *
     * @param type Type of dimension
     */
    public void to(Dimension type) {
        Preconditions.checkNotNull(type);
        this.to = type;
    }

}
