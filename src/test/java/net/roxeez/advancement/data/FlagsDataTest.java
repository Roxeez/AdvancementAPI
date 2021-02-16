package net.roxeez.advancement.data;

public class FlagsDataTest extends DataTest<FlagsData> {

    @Override
    protected FlagsData getObject() {
        FlagsData object = new FlagsData();

        object.setBaby(true);
        object.setSneaking(false);
        object.setSwimming(true);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"is_on_fire\":false,\"is_sneaking\":false,\"is_sprinting\":false,\"is_swimming\":true,\"is_baby\":true}";
    }

}
