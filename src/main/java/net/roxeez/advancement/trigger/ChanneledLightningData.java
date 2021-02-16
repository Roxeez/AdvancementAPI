package net.roxeez.advancement.trigger;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.EntityData;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#CHANNELED_LIGHTNING}
 */
public class ChanneledLightningData implements TriggerData {

    @Expose
    @SerializedName("victims")
    private final List<EntityData> victims = new ArrayList<>();

    /**
     * Add a victim of type selected to required victims
     *
     * @param entityType Type of entity
     */
    public void addVictim(@NotNull EntityType entityType) {
        Preconditions.checkNotNull(entityType);
        addVictim(entity -> entity.setType(entityType));
    }

    /**
     * Add a victim to required victims
     *
     * @param consumer Entity consumer
     */
    public void addVictim(@NotNull Consumer<EntityData> consumer) {
        Preconditions.checkNotNull(consumer);
        EntityData entity = new EntityData();
        consumer.accept(entity);

        victims.add(entity);
    }

}
