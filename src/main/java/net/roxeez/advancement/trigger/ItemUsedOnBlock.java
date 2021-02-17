package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.ItemData;
import net.roxeez.advancement.data.LocationData;
import java.util.function.Consumer;

public class ItemUsedOnBlock implements TriggerData {

    @Expose
    @SerializedName("location")
    private LocationData location;

    @Expose
    @SerializedName("item")
    private ItemData item;

    public void setLocation(Consumer<LocationData> consumer) {
        this.location = new LocationData();
        consumer.accept(location);
    }

    public void setItem(Consumer<ItemData> consumer) {
        this.item = new ItemData();
        consumer.accept(item);
    }

}
