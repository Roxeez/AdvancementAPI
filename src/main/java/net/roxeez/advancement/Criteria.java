package net.roxeez.advancement;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.trigger.Trigger;
import net.roxeez.advancement.trigger.TriggerWrapper;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

public class Criteria {

    private final String name;

    @Expose
    @SerializedName("trigger")
    private final NamespacedKey trigger;

    @Expose
    @SerializedName("conditions")
    private final Trigger data;

    public Criteria(@NotNull String name, @NotNull TriggerWrapper<?> trigger, @NotNull Trigger data) {
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(trigger);
        Preconditions.checkNotNull(data);

        this.name = name;
        this.trigger = trigger.getKey();
        this.data = data;
    }

    /**
     * Get defined name of this criteria
     *
     * @return Name of this criteria
     */
    public String getName() {
        return name;
    }

}
