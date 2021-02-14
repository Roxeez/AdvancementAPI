package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.common.Item;
import net.roxeez.advancement.common.Range;
import org.bukkit.Material;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#ENCHANTED_ITEM}
 */
public class EnchantedItemData implements TriggerData {

    @Expose
    @SerializedName("item")
    private Item item;

    @Expose
    @SerializedName("levels")
    private Range<Integer> levels;

    /**
     * Set required output item after enchantment
     *
     * @param material Material of this item
     */
    public void setItem(Material material) {
        setItem(x -> x.setType(material));
    }

    /**
     * Set required output item after enchantment
     *
     * @param consumer Consumer to build required item
     */
    public void setItem(Consumer<Item> consumer) {
        this.item = new Item();
        consumer.accept(this.item);
    }

    /**
     * Set required levels spent on enchantment
     *
     * @param levels Levels spent on enchantment
     */
    public void setLevels(int levels) {
        this.levels = new Range<>(levels);
    }

    /**
     * Set minimum and maximum levels spent on enchantment
     *
     * @param minimum Minimum level
     * @param maximum Maximum level
     */
    public void setLevels(int minimum, int maximum) {
        this.levels = new Range<>(minimum, maximum);
    }

}
