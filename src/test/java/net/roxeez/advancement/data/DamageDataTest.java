package net.roxeez.advancement.data;

import org.bukkit.entity.EntityType;

public class DamageDataTest extends DataTest<DamageData> {

    @Override
    protected DamageData getObject() {
        DamageData object = new DamageData();
        object.setBlocked(true);
        object.setDamageDealt(10);
        object.setDamageTaken(5);
        object.setSource(EntityType.BEE);
        object.setType(type -> {
            type.setExplosion(true);
        });
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"blocked\":true,\"dealt\":{\"min\":5.0},\"source\":{\"type\":\"minecraft:bee\"},\"type\":{\"bypasses_armor\":false,\"bypasses_invulnerability\":false,\"bypasses_magic\":false,\"is_explosion\":true,\"is_fire\":false,\"is_projectile\":false,\"is_lightning\":false}}";
    }

}
