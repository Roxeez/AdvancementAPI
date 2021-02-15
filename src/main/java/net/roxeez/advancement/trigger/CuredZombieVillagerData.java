package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.Entity;
import java.util.function.Consumer;

public class CuredZombieVillagerData implements TriggerData {

    @Expose
    @SerializedName("villager")
    private Entity villager;

    @Expose
    @SerializedName("zombie")
    private Entity zombie;

    /**
     * Set required villager
     * @param consumer Predicate of entity
     */
    public void setVillager(Consumer<Entity> consumer) {
        this.villager = new Entity();
        consumer.accept(this.villager);
    }

    /**
     * Set required zombie (before cure)
     * @param consumer Predicate of entity
     */
    public void setZombie(Consumer<Entity> consumer) {
        this.zombie = new Entity();
        consumer.accept(this.zombie);
    }
}
