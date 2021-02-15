package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.EntityType;
import java.util.function.Consumer;

public class Damage {

    @Expose
    @SerializedName("blocked")
    private boolean blocked;

    @Expose
    @SerializedName("dealt")
    private Range<Double> dealt;

    @Expose
    @SerializedName("source")
    private Entity source;

    @Expose
    @SerializedName("taken")
    private Range<Double> taken;

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void setDamageDealt(double minimum, double maximum) {
        this.dealt = new Range<>(minimum, maximum);
    }

    public void setDamageDealt(double damage) {
        this.dealt = new Range<>(damage);
    }

    public void setSource(Consumer<Entity> consumer) {
        this.source = new Entity();
        consumer.accept(source);
    }

    public void setSource(EntityType entityType) {
        setSource(entity -> entity.setType(entityType));
    }

    public void setDamageTaken(double minimum, double maximum) {
        this.dealt = new Range<>(minimum, maximum);
    }

    public void setDamageTaken(double damage) {
        this.dealt = new Range<>(damage);
    }

}
