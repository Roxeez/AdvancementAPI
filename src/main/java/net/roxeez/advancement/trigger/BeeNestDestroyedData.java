package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.common.Item;
import net.roxeez.advancement.AdvancementException;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#BEE_NEST_DESTROYED}
 */
public class BeeNestDestroyedData implements TriggerData {

    @Expose
    @SerializedName("block")
    private Material block;

    @Expose
    @SerializedName("item")
    private Item item;

    @Expose
    @SerializedName("numBeesInside")
    private int numBeesInside;

    /**
     * Required destroyed block
     *
     * @param block Block destroyed
     *
     * @throws AdvancementException If material is not a block or a bee nest/beehive
     */
    public void setBlock(@NotNull Material block) {
        Preconditions.checkNotNull(block);

        if (!block.isBlock()) {
            throw new AdvancementException(block.getKey() + " is not a block");
        }

        if (block != Material.BEE_NEST && block != Material.BEEHIVE) {
            throw new AdvancementException(block.getKey() + " is not a bee nest or beehive");
        }

        this.block = block;
    }

    /**
     * Set required item in hand when destroying this bee nest/beehive
     *
     * @param consumer Item predicate
     */
    public void withItem(@NotNull Consumer<Item> consumer) {
        Preconditions.checkNotNull(consumer);
        this.item = new Item();
        consumer.accept(item);
    }

    /**
     * Set required item in hand material when destroying this bee nest/beehive
     * Shortcut to withItem(item -> item.is(material));
     *
     * @param material Material required
     */
    public void withItem(@NotNull Material material) {
        Preconditions.checkNotNull(material);
        withItem(item -> item.setType(material));
    }

    /**
     * Set amount of bee required in this bee nest/beehive when destroying it
     *
     * @param amount Amount of bee
     */
    public void withBeeCount(int amount) {
        this.numBeesInside = amount;
    }
}
