package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DamageType {

    @Expose
    @SerializedName("bypasses_armor")
    private boolean bypassesArmor;

    @Expose
    @SerializedName("bypasses_invulnerability")
    private boolean bypassesInvulnerability;

    @Expose
    @SerializedName("bypasses_magic")
    private boolean bypassesMagic;

    @Expose
    @SerializedName("direct_entity")
    private EntityData directEntity;

    @Expose
    @SerializedName("is_explosion")
    private boolean isExplosion;

    @Expose
    @SerializedName("is_fire")
    private boolean isFire;

    @Expose
    @SerializedName("is_projectile")
    private boolean isProjectile;

    @Expose
    @SerializedName("is_lightning")
    private boolean isLightning;

    @Expose
    @SerializedName("source_entity")
    private EntityData sourceEntity;

}
