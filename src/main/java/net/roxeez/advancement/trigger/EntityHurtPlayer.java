package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.DamageData;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#ENTITY_HURT_PLAYER}
 */
public class EntityHurtPlayer implements Trigger {

    @Expose
    @SerializedName("damage")
    private DamageData damage;

    /**
     * Configuration damage settings
     *
     * @param consumer Consumer for damage configuration
     */
    public void setDamage(Consumer<DamageData> consumer) {
        this.damage = new DamageData();
        consumer.accept(damage);
    }

}
