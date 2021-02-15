package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.Damage;
import java.util.function.Consumer;

/**
 * Data used by {@link TriggerType#ENTITY_HURT_PLAYER}
 */
public class EntityHurtPlayerData implements TriggerData {

    @Expose
    @SerializedName("damage")
    private Damage damage;

    /**
     * Configuration damage settings
     *
     * @param consumer Consumer for damage configuration
     */
    public void setDamage(Consumer<Damage> consumer) {
        this.damage = new Damage();
        consumer.accept(damage);
    }

}
