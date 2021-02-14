package net.roxeez.advancement.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.EntityType;

public class Entity {

    @Expose
    @SerializedName("type")
    private EntityType type;

    public void setType(EntityType type) {
        this.type = type;
    }

}
