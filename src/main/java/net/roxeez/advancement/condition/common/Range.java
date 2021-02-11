package net.roxeez.advancement.condition.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Range<T> {

    @Expose
    @SerializedName("min")
    private final T minimum;

    @Expose
    @SerializedName("max")
    private final T maximum;

    public Range(T minimum) {
        this.minimum = minimum;
        this.maximum = null;
    }

    public Range(T minimum, T maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}
