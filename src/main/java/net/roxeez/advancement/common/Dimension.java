package net.roxeez.advancement.common;

import com.google.common.base.Preconditions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Arrays;

/**
 * All possible dimension type
 */
public enum Dimension {

    OVERWORLD("overworld"),
    THE_NETHER("the_nether"),
    THE_END("the_end");

    private final String name;

    Dimension(String name) {
        this.name = name;
    }

    /**
     * Name of this dimension
     *
     * @return Name of the dimension
     */
    public String getName() {
        return name;
    }

    @Nullable
    public static Dimension getByName(@NotNull String name) {
        Preconditions.checkNotNull(name);
        return Arrays.stream(Dimension.values()).filter(x -> x.getName().equals(name)).findFirst().orElse(null);
    }
}
