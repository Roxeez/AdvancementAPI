package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.Material;

// TODO : Add enchantments, stored_enchantments, tag
public class ItemData {

    @Expose
    @SerializedName("item")
    private Material item;

    @Expose
    @SerializedName("count")
    private Range<Integer> count;

    @Expose
    @SerializedName("durability")
    private Range<Integer> durability;

    @Expose
    @SerializedName("potion")
    private PotionType potion;
    
    @Expose
    @SerializedName("nbt")
    private String nbt;

    public void setType(Material material) {
        this.item = material;
    }

    public void setCount(int minimum) {
        count = new Range<>(minimum);
    }

    public void setCount(int minimum, int maximum) {
        count = new Range<>(minimum, maximum);
    }

    public void setDurability(int minimum) {
        durability = new Range<>(minimum);
    }

    public void setDurability(int minimum, int maximum) {
        durability = new Range<>(minimum, maximum);
    }

    public void setPotion(PotionType potion) {
        this.potion = potion;
    }
    
    public void setNbt(String nbt) {
        this.nbt = nbt;
    }
    
}
