package net.roxeez.advancement.data;

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

    public void setType(Material material) {
        this.item = material;
    }

    public void setCount(int minimum) {
        count = new Range<>(minimum);
    }

    public void setCount(int minimum, int maximum) {
        count = new Range<>(minimum, maximum);
    }

}
