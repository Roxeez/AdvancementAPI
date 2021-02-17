package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.ItemData;
import net.roxeez.advancement.data.Range;
import java.util.function.Consumer;

public class ItemDurabilityChanged implements TriggerData {

    @Expose
    @SerializedName("delta")
    private Range<Integer> delta;

    @Expose
    @SerializedName("durability")
    private Range<Integer> durability;

    @Expose
    @SerializedName("item")
    private ItemData item;

    public void setDelta(int value) {
        this.delta = new Range<>(value);
    }

    public void setDelta(int min, int max) {
        this.delta = new Range<>(min, max);
    }

    public void setDurability(int value) {
        this.durability = new Range<>(value);
    }

    public void setDurability(int min, int max) {
        this.durability = new Range<>(min, max);
    }

    public void setItem(Consumer<ItemData> consumer) {
        this.item = new ItemData();
        consumer.accept(item);
    }

}
