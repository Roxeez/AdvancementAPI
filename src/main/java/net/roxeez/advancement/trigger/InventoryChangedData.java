package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.Item;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#INVENTORY_CHANGED}
 */
public class InventoryChangedData implements TriggerData {

    @Expose
    @SerializedName("items")
    private final List<Item> items = new ArrayList<>();

    /**
     * Add an ItemPredicate used to check if item matching data is in inventory
     *
     * @param consumer Predicate of item
     */
    public void hasItemMatching(@NotNull Consumer<Item> consumer) {
        Preconditions.checkNotNull(consumer);
        Item predicate = new Item();
        consumer.accept(predicate);

        items.add(predicate);
    }

    /**
     * Check if inventory contains this Material
     * Shortcut of #hasItemMatching(item -> item.setType(material));
     *
     * @param material Item material
     */
    public void hasItem(@NotNull Material material) {
        Preconditions.checkNotNull(material);
        Item predicate = new Item();
        predicate.setType(material);

        items.add(predicate);
    }

}
