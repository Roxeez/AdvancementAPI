package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.DamageType;
import net.roxeez.advancement.data.EntityData;
import java.util.function.Consumer;

public class EntityKilledPlayerData implements TriggerData {

    @Expose
    @SerializedName("entity")
    private EntityData entity;

    @Expose
    @SerializedName("killing_blow")
    private DamageType killingBlow;

    public void setEntity(Consumer<EntityData> consumer) {
        this.entity = new EntityData();
        consumer.accept(entity);
    }

    public void setKillingBlow(Consumer<DamageType> consumer) {
        this.killingBlow = new DamageType();
        consumer.accept(killingBlow);
    }

}
