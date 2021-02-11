package net.roxeez.advancement.condition.common;

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

}
