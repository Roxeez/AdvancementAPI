package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Effect {

    @Expose
    @SerializedName("amplifier")
    private Range<Integer> amplifier;

    @Expose
    @SerializedName("duration")
    private Range<Integer> duration;

    public void setAmplifier(int minimum) {
        this.amplifier = new Range<>(minimum);
    }

    public void setDuration(int minimum) {
        this.duration = new Range<>(minimum);
    }

    public void setAmplifier(int minimum, int maximum) {
        this.amplifier = new Range<>(minimum, maximum);
    }

    public void setDuration(int minimum, int maximum) {
        this.duration = new Range<>(minimum, maximum);
    }

}
