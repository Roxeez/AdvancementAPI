package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.EntityType;
import java.util.function.Consumer;

public class Entity {

    @Expose
    @SerializedName("type")
    private EntityType type;

    @Expose
    @SerializedName("distance")
    private Distance distance;

    public void setType(EntityType type) {
        this.type = type;
    }

    public void setDistance(Consumer<Distance> consumer) {
        this.distance = new Distance();
        consumer.accept(this.distance);
    }

}
