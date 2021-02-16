package net.roxeez.advancement.data;

public class DistanceDataTest extends DataTest<DistanceData> {

    @Override
    protected DistanceData getObject() {
        DistanceData object = new DistanceData();
        object.setX(10);
        object.setAbsolute(5);
        object.setHorizontal(9);
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"absolute\":{\"min\":5.0},\"horizontal\":{\"min\":9.0},\"x\":{\"min\":10.0}}";
    }

}
