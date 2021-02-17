package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.AdvancementException;
import net.roxeez.advancement.data.ItemData;
import net.roxeez.advancement.data.LocationData;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#PLACED_BLOCK}
 */
public class PlacedBlock implements TriggerData {

    @Expose
    @SerializedName("block")
    private Material block;

    @Expose
    @SerializedName("item")
    private ItemData item;

    @Expose
    @SerializedName("location")
    private LocationData location;

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

    public void setItem(Consumer<ItemData> consumer) {
        this.item = new ItemData();
        consumer.accept(item);
    }

    public void setLocation(Consumer<LocationData> consumer) {
        this.location = new LocationData();
        consumer.accept(location);
    }

}
