package net.roxeez.advancement.display;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

/**
 * Represent an advancement icon
 */
public class Icon {

    /**
     * Key of displayed item in this icon
     */
    @Expose
    @SerializedName("item")
    private NamespacedKey item;
    
    /**
     * NBT values of displayed item in this icon
     */
    @Expose
    @SerializedName("nbt")
    private String nbt;
    
    public Icon() {
    }
    
    public Icon(@NotNull NamespacedKey item, String nbt) {
        Preconditions.checkNotNull(item);
        this.item = item;
        this.nbt = nbt;
    }
    
    public Icon(@NotNull Material material, String nbt) {
        Preconditions.checkNotNull(material);
        this.item = material.getKey();
        this.nbt = nbt;
    }
    
    /**
     * Set item shown in this icon
     *
     * @param material Material to display in this icon
     */
    public void setItem(@NotNull Material material) {
        Preconditions.checkNotNull(material);
        this.item = material.getKey();
    }
    
    /**
     * Set the NBT values of the icon
     * 
     * @param nbt NBT values of the displayed icon
     */
    public void setNbt(String nbt) {
        this.nbt = nbt;
    }
    
}
