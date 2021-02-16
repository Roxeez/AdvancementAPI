package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.EntityData;
import java.util.function.Consumer;

public class CuredZombieVillagerData implements TriggerData {

    @Expose
    @SerializedName("villager")
    private EntityData villager;

    @Expose
    @SerializedName("zombie")
    private EntityData zombie;

    /**
     * Set required villager
     * @param consumer Predicate of entity
     */
    public void setVillager(Consumer<EntityData> consumer) {
        this.villager = new EntityData();
        consumer.accept(this.villager);
    }

    /**
     * Set required zombie (before cure)
     * @param consumer Predicate of entity
     */
    public void setZombie(Consumer<EntityData> consumer) {
        this.zombie = new EntityData();
        consumer.accept(this.zombie);
    }
}
