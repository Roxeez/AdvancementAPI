package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position {

    @Expose
    @SerializedName("x")
    private Range<Double> x;

    @Expose
    @SerializedName("y")
    private Range<Double> y;

    @Expose
    @SerializedName("z")
    private Range<Double> z;

    public void setX(double x) {
        this.x = new Range<>(x);
    }

    public void setY(double y) {
        this.y = new Range<>(y);
    }

    public void setZ(double z) {
        this.z = new Range<>(z);
    }

    public void setX(double minimum, double maximum) {
        this.x = new Range<>(minimum, maximum);
    }

    public void setY(double minimum, double maximum) {
        this.y = new Range<>(minimum, maximum);
    }

    public void setZ(double minimum, double maximum) {
        this.z = new Range<>(minimum, maximum);
    }
}
