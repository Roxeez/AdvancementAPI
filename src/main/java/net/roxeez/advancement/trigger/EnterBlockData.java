package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.utility.KeyValue;
import org.bukkit.Material;

/**
 * Data used by {@link TriggerType#ENTER_BLOCK}
 */
public class EnterBlockData implements TriggerData {

    @Expose
    @SerializedName("block")
    private Material block;

    @Expose
    @SerializedName("state")
    private KeyValue<String, String> state;

    /**
     * Set required block
     *
     * @param block Block material
     */
    public void setBlock(Material block) {
        this.block = block;
    }

    /**
     * Set required state of the block
     *
     * @param name Name of the state
     * @param value Value of the state
     */
    public void setState(String name, String value) {
        this.state = new KeyValue<>(name, value);
    }

}
