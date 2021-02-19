package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.DistanceData;
import java.util.function.Consumer;

public class UsedEnderEye implements Trigger {

    @Expose
    @SerializedName("distance")
    private DistanceData distance;

    public void setDistance(Consumer<DistanceData> consumer)
    {
        this.distance = new DistanceData();
        consumer.accept(distance);
    }
}
