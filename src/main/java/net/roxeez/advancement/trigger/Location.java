package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.function.Consumer;

public class Location implements TriggerData {

    @Expose
    @SerializedName("location")
    private net.roxeez.advancement.data.LocationData location;

    public void setLocation(Consumer<net.roxeez.advancement.data.LocationData> consumer) {
        this.location = new net.roxeez.advancement.data.LocationData();
        consumer.accept(location);
    }
}
