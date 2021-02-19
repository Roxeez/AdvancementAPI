package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.EntityData;
import java.util.function.Consumer;

// TODO : Projectile
public class TargetHit implements Trigger {

    @Expose
    @SerializedName("signal_strength")
    private int signalStrength;

    @Expose
    @SerializedName("shooter")
    private EntityData shooter;

    public void setShooter(Consumer<EntityData> consumer) {
        this.shooter = new EntityData();
        consumer.accept(shooter);
    }

    public void setSignalStrength(int strength) {
        this.signalStrength = strength;
    }

}
