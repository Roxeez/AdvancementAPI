package net.roxeez.advancement.trigger;

import net.roxeez.advancement.data.DistanceData;
import net.roxeez.advancement.data.LocationData;
import java.util.function.Consumer;

public class NetherTravel implements TriggerData {

    private LocationData entered;
    private LocationData exited;
    private DistanceData distance;

    public void setEntered(Consumer<LocationData> consumer) {
        this.entered = new LocationData();
        consumer.accept(entered);
    }

    public void setExited(Consumer<LocationData> consumer) {
        this.exited = new LocationData();
        consumer.accept(exited);
    }

    public void setDistance(Consumer<DistanceData> consumer) {
        this.distance = new DistanceData();
        consumer.accept(distance);
    }

}
