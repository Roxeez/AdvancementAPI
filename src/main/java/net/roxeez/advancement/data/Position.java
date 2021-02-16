package net.roxeez.advancement.data;

public class Position {

    private Range<Double> x;
    private Range<Double> y;
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
        this.x = new Range<>(minimum, maximum);
    }

    public void setZ(double minimum, double maximum) {
        this.x = new Range<>(minimum, maximum);
    }
}
