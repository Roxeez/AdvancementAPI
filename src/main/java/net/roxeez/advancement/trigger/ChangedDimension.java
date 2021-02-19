package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.DimensionType;
import org.jetbrains.annotations.NotNull;

public class ChangedDimension implements Trigger {

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
    public void setFrom(@NotNull DimensionType type) {
        Preconditions.checkNotNull(type);
        this.from = type;
    }

    /**
     * The dimension the entity traveled to
     *
     * @param type Type of dimension
     */
    public void setTo(DimensionType type) {
        Preconditions.checkNotNull(type);
        this.to = type;
    }

}
