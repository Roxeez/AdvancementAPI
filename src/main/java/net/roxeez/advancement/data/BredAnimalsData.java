package net.roxeez.advancement.data;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.common.Entity;
import net.roxeez.advancement.trigger.TriggerType;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#BRED_ANIMALS}
 */
public class BredAnimalsData implements TriggerData {

    @Expose
    @SerializedName("child")
    private Entity child;

    @Expose
    @SerializedName("parent")
    private Entity parent;

    @Expose
    @SerializedName("partner")
    private Entity partner;

    /**
     * Set required child
     *
     * @param consumer Predicate of entity
     */
    public void child(@NotNull Consumer<Entity> consumer) {
        Preconditions.checkNotNull(consumer);
        Entity entity = new Entity();
        consumer.accept(entity);

        this.child = entity;
    }

    /**
     * Set required child entity type
     * Shortcut to setChild(entity -> entity.is(entityType));
     *
     * @param entityType Type of entity required
     */
    public void child(@NotNull EntityType entityType) {
        Preconditions.checkNotNull(entityType);
        child(entity -> entity.is(entityType));
    }

    /**
     * Set required parent entity type
     * Shortcut to setParent(entity -> entity.is(entityType));
     *
     * @param entityType Type of entity required
     */
    public void parent(@NotNull EntityType entityType) {
        Preconditions.checkNotNull(entityType);
        parent(entity -> entity.is(entityType));
    }

    /**
     * Set required partner entity type
     * Shortcut to setPartner(entity -> entity.is(entityType));
     *
     * @param entityType Type of entity required
     */
    public void partner(@NotNull EntityType entityType) {
        Preconditions.checkNotNull(entityType);
        partner(entity -> entity.is(entityType));
    }

    /**
     * Set required parent
     *
     * @param consumer Predicate of entity
     */
    public void parent(@NotNull Consumer<Entity> consumer) {
        Preconditions.checkNotNull(consumer);
        Entity entity = new Entity();
        consumer.accept(entity);

        this.parent = entity;
    }

    /**
     * Set required partner
     *
     * @param consumer Predicate of entity
     */
    public void partner(@NotNull Consumer<Entity> consumer) {
        Preconditions.checkNotNull(consumer);

        Entity entity = new Entity();
        consumer.accept(entity);

        this.partner = entity;
    }

}
