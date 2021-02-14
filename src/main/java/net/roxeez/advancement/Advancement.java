package net.roxeez.advancement;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.TriggerData;
import net.roxeez.advancement.display.Display;
import net.roxeez.advancement.trigger.Trigger;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Base class of any advancement
 */
public class Advancement {

    /**
     * Unique key of this advancement
     * You can't create two advancement with same key
     */
    private final NamespacedKey key;
    /**
     * Criteria of this advancement
     * Can't be empty
     */
    @Expose
    @SerializedName("criteria")
    private final Map<String, Criteria> criteria = new HashMap<>();
    /**
     * List of list of this advancement
     * Can be empty
     */
    @Expose
    @SerializedName("requirements")
    private final List<String[]> requirements = new ArrayList<>();
    /**
     * Display of this advancement
     * Can be null if no display
     */
    @Expose
    @SerializedName("display")
    private Display display;
    /**
     * Parent of this advancement
     * Can be null if none
     */
    @Expose
    @SerializedName("parent")
    private NamespacedKey parent;

    /**
     * Create a new advancement with defined key
     *
     * @param key Key of this advancement
     */
    public Advancement(@NotNull NamespacedKey key) {
        Preconditions.checkNotNull(key);
        this.key = key;
    }

    /**
     * Create a new advancement with defined id
     *
     * @param plugin Plugin owning this advancement
     * @param id     Id of this advancement
     */
    public Advancement(@NotNull Plugin plugin, @NotNull String id) {
        Preconditions.checkNotNull(plugin);
        Preconditions.checkNotNull(id);
        this.key = new NamespacedKey(plugin, id);
    }

    /**
     * Set parent of this advancement using specific key
     * If parent is one of your advancement, please use setParent(Advancement) instead
     *
     * @param key Key of parent advancement of this advancement
     */
    public void setParent(@NotNull NamespacedKey key) {
        Preconditions.checkNotNull(key);
        this.parent = key;
    }

    /**
     * Set display of this advancement
     * This method will set display property of advancement and execute defined consumer on it
     *
     * @param display Consumer to execute on this advancement display
     */
    public void setDisplay(@NotNull Consumer<Display> display) {
        Preconditions.checkNotNull(display);

        Display object = new Display();
        display.accept(object);

        this.display = object;
    }

    /**
     * Call this method will add a criteria as a requirement for this advancement
     * This criteria must be completed to get this advancement
     * <p>
     * If you need one of multiple criteria to be completed, use addRequirements with all of them instead
     * This method act like a AND condition for criteria (if you have multiple)
     *
     * @param criteria Criteria to add as requirement
     */
    public void addRequirement(@NotNull Criteria criteria) {
        Preconditions.checkNotNull(criteria);
        this.requirements.add(new String[] {criteria.getName()});
    }

    /**
     * Call this method will add all criteria as a requirement for this advancement
     * One of these criteria must be completed to get this advancement
     * <p>
     * If you need all your criteria to be completed, use addRequirement for each of them instead
     * This method act like a OR condition for criteria
     *
     * @param criterion Criterion to add as requirement
     */
    public void addRequirements(@NotNull Criteria... criterion) {
        Preconditions.checkNotNull(criterion);
        this.requirements.add(Arrays.stream(criterion).map(Criteria::getName).toArray(String[]::new));
    }

    /**
     * Add a criteria to this advancement
     *
     * @param name      Name of the criteria
     * @param trigger   Trigger used by this criteria
     * @param data      Trigger data builder of this criteria trigger
     *
     * @return Created criteria
     */
    @NotNull
    public <T extends TriggerData> Criteria addCriteria(@NotNull String name, @NotNull Trigger<T> trigger, @NotNull Consumer<T> data) {
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(trigger);
        Preconditions.checkNotNull(data);

        if (criteria.containsKey(name)) {
            return criteria.get(name);
        }

        T object;
        try {
            object = trigger.getClazz().newInstance();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

        data.accept(object);

        Criteria criteria = new Criteria(name, trigger, object);

        this.criteria.put(name, criteria);

        return criteria;
    }

    /**
     * Get unique key of this advancement
     *
     * @return Key of this advancement
     */
    public NamespacedKey getKey() {
        return key;
    }

}
