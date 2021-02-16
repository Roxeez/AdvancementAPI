package net.roxeez.advancement.data;

import org.bukkit.entity.EntityType;

public class DamageTypeTest extends DataTest<DamageType> {

    @Override
    protected DamageType getObject() {
        DamageType object = new DamageType();
        object.setBypassesArmor(true);
        object.setExplosion(true);
        object.setDirectEntity(entity -> {
            entity.setType(EntityType.BAT);
        });
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"bypasses_armor\":true,\"bypasses_invulnerability\":false,\"bypasses_magic\":false,\"direct_entity\":{\"type\":\"minecraft:bat\"},\"is_explosion\":true,\"is_fire\":false,\"is_projectile\":false,\"is_lightning\":false}";
    }

}
