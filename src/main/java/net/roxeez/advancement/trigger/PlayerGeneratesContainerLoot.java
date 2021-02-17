package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.NamespacedKey;

public class PlayerGeneratesContainerLoot implements TriggerData {

    @Expose
    @SerializedName("loot_table")
    private NamespacedKey lootTable;

    public void setLootTable(NamespacedKey lootTable) {
        this.lootTable = lootTable;
    }

}
