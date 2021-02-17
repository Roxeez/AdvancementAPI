package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.ItemData;
import java.util.function.Consumer;

public class FilledBucket implements TriggerData {

    @Expose
    @SerializedName("item")
    private ItemData item;

    public void setItem(Consumer<ItemData> consumer) {
        this.item = new ItemData();
        consumer.accept(item);
    }

}
