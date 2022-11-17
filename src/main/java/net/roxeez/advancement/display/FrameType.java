package net.roxeez.advancement.display;

/**
 * Represent all possible advancement frame
 */
public enum FrameType {
    CHALLENGE("challenge"),
    TASK("task"),
    GOAL("goal");

    private final String name;

    FrameType(String name) {
        this.name = name;
    }

    /**
     * Name of this frame (mostly enum name to lowercase)
     *
     * @return Name of this frame
     */
    public String getName() {
        return name;
    }
}
