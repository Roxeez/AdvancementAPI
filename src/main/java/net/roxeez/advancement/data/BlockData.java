package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.Material;

// TODO: Add tag/nbt/state properties
public class BlockData {

    @Expose
    @SerializedName("block")
    private Material block;

    public void setType(Material material) {
        this.block = material;
    }
}
