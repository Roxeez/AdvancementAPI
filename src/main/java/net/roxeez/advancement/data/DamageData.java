package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.EntityType;
import java.util.function.Consumer;

public class DamageData {

    @Expose
    @SerializedName("blocked")
    private boolean blocked;

    @Expose
    @SerializedName("dealt")
    private Range<Double> dealt;

    @Expose
    @SerializedName("source")
    private EntityData source;

    @Expose
    @SerializedName("taken")
    private Range<Double> taken;

    @Expose
    @SerializedName("type")
    private DamageType type;

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void setDamageDealt(double minimum, double maximum) {
        this.dealt = new Range<>(minimum, maximum);
    }

    public void setDamageDealt(double damage) {
        this.dealt = new Range<>(damage);
    }

    public void setSource(Consumer<EntityData> consumer) {
        this.source = new EntityData();
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

    public void setType(Consumer<DamageType> consumer) {
        this.type = new DamageType();
        consumer.accept(type);
    }
}
