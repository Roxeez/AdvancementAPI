package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import net.roxeez.advancement.condition.Conditions;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

/**
 * Represent a trigger
 *
 * @param <T> Type of the conditions bind to this trigger
 */
public class Trigger<T extends Conditions> {

    private final NamespacedKey key;
    private final Class<T> clazz;

    public Trigger(@NotNull String key, @NotNull Class<T> clazz) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(clazz);

        this.key = NamespacedKey.minecraft(key);
        this.clazz = clazz;
    }

    /**
     * Get key of this trigger
     *
     * @return Key of this trigger
     */
    public NamespacedKey getKey() {
        return key;
    }

    /**
     * Get conditions class of this trigger
     *
     * @return Conditions class of this trigger
     */
    public Class<T> getClazz() {
        return clazz;
    }

}
