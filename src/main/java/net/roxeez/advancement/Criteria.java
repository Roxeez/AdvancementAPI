package net.roxeez.advancement;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.condition.Conditions;
import net.roxeez.advancement.trigger.Trigger;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

public class Criteria {

    private final String name;

    @Expose
    @SerializedName("trigger")
    private final NamespacedKey trigger;

    @Expose
    @SerializedName("conditions")
    private final Conditions conditions;

    public Criteria(@NotNull String name, @NotNull Trigger<?> trigger, @NotNull Conditions conditions) {
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(trigger);
        Preconditions.checkNotNull(conditions);

        this.name = name;
        this.trigger = trigger.getKey();
        this.conditions = conditions;
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
