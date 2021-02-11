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
     * Set item shown in this icon
     *
     * @param material Material to display in this icon
     */
    public void setItem(@NotNull Material material) {
        Preconditions.checkNotNull(material);
        this.item = material.getKey();
    }

}
