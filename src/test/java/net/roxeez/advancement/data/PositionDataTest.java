package net.roxeez.advancement.data;

public class PositionDataTest extends DataTest<PositionData> {

    @Override
    protected PositionData getObject() {
        PositionData object = new PositionData();
        object.setX(10);
        object.setY(10);
        object.setZ(10);
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"x\":{\"min\":10.0},\"y\":{\"min\":10.0},\"z\":{\"min\":10.0}}";
    }

}
