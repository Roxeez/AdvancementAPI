package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.common.Range;

/**
 * Data used by {@link TriggerType#CONSTRUCT_BEACON}
 */
public class ConstructBeaconData implements TriggerData {

    @Expose
    @SerializedName("level")
    private Range<Integer> level;

    /**
     * Set the required tier of the updated beacon structure.
     *
     * @param minimum Minimum level
     * @param maximum Maximum level
     */
    public void level(int minimum, int maximum) {
        this.level = new Range<>(minimum, maximum);
    }

    /**
     * Set the required tier of the updated beacon structure.
     *
     * @param level Level required
     */
    public void level(int level) {
        this.level = new Range<>(level);
    }
}
