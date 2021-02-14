package net.roxeez.advancement;

import org.jetbrains.annotations.NotNull;

/**
 * Represent an advancement creator
 */
public interface AdvancementCreator {

    /**
     * Create an advancement
     *
     * @param context Context for creation
     *
     * @return Created advancement
     */
    @NotNull
    Advancement create(@NotNull Context context);

}
