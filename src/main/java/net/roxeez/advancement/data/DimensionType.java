package net.roxeez.advancement.data;

import com.google.common.base.Preconditions;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Arrays;

/**
 * All possible dimension type
 */
public enum DimensionType {

    OVERWORLD("overworld"),
    THE_NETHER("the_nether"),
    THE_END("the_end");

    private final NamespacedKey name;

    DimensionType(String name) {
        this.name = NamespacedKey.minecraft(name);
    }

    /**
     * Name of this dimension
     *
     * @return Name of the dimension
     */
    public NamespacedKey getKey() {
        return name;
    }

    @Nullable
    public static DimensionType getByName(@NotNull String name) {
        Preconditions.checkNotNull(name);
        return Arrays.stream(DimensionType.values()).filter(x -> x.getKey().getKey().equals(name.toLowerCase())).findFirst().orElse(null);
    }
}
