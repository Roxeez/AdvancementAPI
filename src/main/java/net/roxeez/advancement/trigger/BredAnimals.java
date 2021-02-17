package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.EntityData;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#BRED_ANIMALS}
 */
public class BredAnimals implements TriggerData {

    @Expose
    @SerializedName("child")
    private EntityData child;

    @Expose
    @SerializedName("parent")
    private EntityData parent;

    @Expose
    @SerializedName("partner")
    private EntityData partner;

    /**
     * Set required child
     *
     * @param consumer Predicate of entity
     */
    public void setChild(@NotNull Consumer<EntityData> consumer) {
        Preconditions.checkNotNull(consumer);
        this.child = new EntityData();
        consumer.accept(this.child);
    }

    /**
     * Set required child entity type
     * Shortcut to setChild(entity -> entity.is(entityType));
     *
     * @param entityType Type of entity required
     */
    public void setChild(@NotNull EntityType entityType) {
        Preconditions.checkNotNull(entityType);
        setChild(entity -> entity.setType(entityType));
    }

    /**
     * Set required parent entity type
     * Shortcut to setParent(entity -> entity.is(entityType));
     *
     * @param entityType Type of entity required
     */
    public void setParent(@NotNull EntityType entityType) {
        Preconditions.checkNotNull(entityType);
        setParent(entity -> entity.setType(entityType));
    }

    /**
     * Set required partner entity type
     * Shortcut to setPartner(entity -> entity.is(entityType));
     *
     * @param entityType Type of entity required
     */
    public void setPartner(@NotNull EntityType entityType) {
        Preconditions.checkNotNull(entityType);
        setPartner(entity -> entity.setType(entityType));
    }

    /**
     * Set required parent
     *
     * @param consumer Predicate of entity
     */
    public void setParent(@NotNull Consumer<EntityData> consumer) {
        Preconditions.checkNotNull(consumer);
        this.parent = new EntityData();
        consumer.accept(this.parent);
    }

    /**
     * Set required partner
     *
     * @param consumer Predicate of entity
     */
    public void setPartner(@NotNull Consumer<EntityData> consumer) {
        Preconditions.checkNotNull(consumer);
        this.partner = new EntityData();
        consumer.accept(this.partner);
    }

}
