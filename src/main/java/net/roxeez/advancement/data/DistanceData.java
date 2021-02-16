package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DistanceData {

    @Expose
    @SerializedName("absolute")
    private Range<Float> absolute;

    @Expose
    @SerializedName("horizontal")
    private Range<Float> horizontal;

    @Expose
    @SerializedName("x")
    private Range<Float> x;

    @Expose
    @SerializedName("y")
    private Range<Float> y;

    @Expose
    @SerializedName("z")
    private Range<Float> z;

    public void setAbsolute(float minimum, float maximum) {
        this.absolute = new Range<>(minimum, maximum);
    }

    public void setAbsolute(float minimum) {
        this.absolute = new Range<>(minimum);
    }

    public void setHorizontal(float minimum, float maximum) {
        this.horizontal = new Range<>(minimum, maximum);
    }

    public void setHorizontal(float minimum) {
        this.horizontal = new Range<>(minimum);
    }

    public void setX(float minimum, float maximum) {
        this.x = new Range<>(minimum, maximum);
    }

    public void setX(float minimum) {
        this.x = new Range<>(minimum);
    }

    public void setY(float minimum, float maximum) {
        this.y = new Range<>(minimum, maximum);
    }

    public void setY(float minimum) {
        this.y = new Range<>(minimum);
    }

    public void setZ(float minimum, float maximum) {
        this.z = new Range<>(minimum, maximum);
    }

    public void setZ(float minimum) {
        this.z = new Range<>(minimum);
    }
}
