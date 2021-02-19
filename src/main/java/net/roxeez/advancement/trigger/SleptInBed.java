package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.LocationData;
import java.util.function.Consumer;

public class SleptInBed implements Trigger {

    @Expose
    @SerializedName("location")
    private LocationData location;

    public void setLocation(Consumer<LocationData> consumer) {
        this.location = new LocationData();
        consumer.accept(location);
    }
}
