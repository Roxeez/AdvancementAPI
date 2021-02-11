package net.roxeez.advancement.condition.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.Material;

public class Item {

    @Expose
    @SerializedName("item")
    private Material item;

    @Expose
    @SerializedName("count")
    private Range<Integer> count;

    public void is(Material material) {
        this.item = material;
    }

    public void count(int minimum) {
        count = new Range<>(minimum);
    }

    public void count(int minimum, int maximum) {
        count = new Range<>(minimum, maximum);
    }

}
