package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.swing.text.html.parser.Entity;
import java.util.function.Consumer;

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

    public void setDirectEntity(Consumer<EntityData> consumer) {
        this.directEntity = new EntityData();
        consumer.accept(directEntity);
    }

    public void setSourceEntity(Consumer<EntityData> consumer) {
        this.sourceEntity = new EntityData();
        consumer.accept(sourceEntity);
    }

    public void setBypassesArmor(boolean bypassesArmor) {
        this.bypassesArmor = bypassesArmor;
    }

    public void setBypassesInvulnerability(boolean bypassesInvulnerability) {
        this.bypassesInvulnerability = bypassesInvulnerability;
    }

    public void setBypassesMagic(boolean bypassesMagic) {
        this.bypassesMagic = bypassesMagic;
    }

    public void setExplosion(boolean explosion) {
        isExplosion = explosion;
    }

    public void setFire(boolean fire) {
        isFire = fire;
    }

    public void setProjectile(boolean projectile) {
        isProjectile = projectile;
    }

    public void setLightning(boolean lightning) {
        isLightning = lightning;
    }

}
