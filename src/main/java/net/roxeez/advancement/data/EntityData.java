package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

// TODO : Add nbt
public class EntityData {

    @Expose
    @SerializedName("type")
    private EntityType type;

    @Expose
    @SerializedName("distance")
    private DistanceData distance;

    @Expose
    @SerializedName("effects")
    private Map<EffectType, EffectData> effects;

    @Expose
    @SerializedName("equipments")
    private EquipmentData equipments;

    @Expose
    @SerializedName("flags")
    private Flags flags;

    @Expose
    @SerializedName("location")
    private LocationData location;

    @Expose
    @SerializedName("player")
    private PlayerData player;

    @Expose
    @SerializedName("targeted_entity")
    private EntityData targetedEntity;

    @Expose
    @SerializedName("vehicle")
    private EntityData vehicle;

    public void setType(EntityType type) {
        this.type = type;
    }

    public void setDistance(Consumer<DistanceData> consumer) {
        this.distance = new DistanceData();
        consumer.accept(this.distance);
    }

    public void addEffect(EffectType effectType, Consumer<EffectData> consumer) {
        if (this.effects == null) {
            this.effects = new HashMap<>();
        }

        EffectData effectData = new EffectData();
        consumer.accept(effectData);
        this.effects.put(effectType, effectData);
    }

    public void setEquipments(Consumer<EquipmentData> consumer) {
        this.equipments = new EquipmentData();
        consumer.accept(equipments);
    }

    public void setFlags(Consumer<Flags> consumer) {
        this.flags = new Flags();
        consumer.accept(flags);
    }

    public void setLocation(Consumer<LocationData> consumer) {
        this.location = new LocationData();
        consumer.accept(location);
    }

    public void setTargetedEntity(Consumer<EntityData> consumer) {
        this.targetedEntity = new EntityData();
        consumer.accept(targetedEntity);
    }

    public void setVehicle(Consumer<EntityData> consumer) {
        this.vehicle = new EntityData();
        consumer.accept(vehicle);
    }

    public void setPlayer(Consumer<PlayerData> consumer) {
        this.player = new PlayerData();
        consumer.accept(player);
    }
}
