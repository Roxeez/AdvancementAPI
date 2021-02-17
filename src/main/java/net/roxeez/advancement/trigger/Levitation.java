package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.DistanceData;
import net.roxeez.advancement.data.Range;
import java.util.function.Consumer;

public class Levitation implements TriggerData {

    @Expose
    @SerializedName("distance")
    private DistanceData distance;

    @Expose
    @SerializedName("duration")
    private Range<Integer> duration;

    public void setDistance(Consumer<DistanceData> consumer) {
        this.distance = new DistanceData();
        consumer.accept(distance);
    }

    public void setDuration(int value) {
        this.duration = new Range<>(value);
    }

}
