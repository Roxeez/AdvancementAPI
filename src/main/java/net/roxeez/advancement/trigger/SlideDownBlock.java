package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.Material;

public class SlideDownBlock implements Trigger {

    @Expose
    @SerializedName("block")
    private Material block;

    public void setBlock(Material block) {
        this.block = block;
    }
}
