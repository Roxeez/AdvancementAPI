package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.AdvancementException;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

/**
 * Data used by {@link TriggerType#PLACED_BLOCK}
 */
public class PlacedBlockData implements TriggerData {

    @Expose
    @SerializedName("block")
    private Material block;

    /**
     * Set which block should be placed
     *
     * @param material Block material
     *
     * @throws AdvancementException If Material is not a block
     */
    public void setBlock(@NotNull Material material) {
        Preconditions.checkNotNull(material);
        if (!material.isBlock()) {
            throw new AdvancementException("Calling PlacedBlock#is with a non block Material");
        }

        this.block = material;
    }

}
