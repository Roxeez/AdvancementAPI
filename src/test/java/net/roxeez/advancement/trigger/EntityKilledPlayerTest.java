package net.roxeez.advancement.trigger;

import org.bukkit.entity.EntityType;

public class EntityKilledPlayerTest extends TriggerTest<EntityKilledPlayer> {

    @Override
    protected EntityKilledPlayer getObject() {
        EntityKilledPlayer object = new EntityKilledPlayer();
        object.setEntity(entity -> {
            entity.setType(EntityType.SKELETON);
        });
        object.setKillingBlow(damage -> {
            damage.setProjectile(true);
        });
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"entity\":{\"type\":\"minecraft:skeleton\"},\"killing_blow\":{\"bypasses_armor\":false,\"bypasses_invulnerability\":false,\"bypasses_magic\":false,\"is_explosion\":false,\"is_fire\":false,\"is_projectile\":true,\"is_lightning\":false}}";
    }

    @Override
    protected TriggerWrapper<EntityKilledPlayer> getTrigger() {
        return TriggerType.ENTITY_KILLED_PLAYER;
    }

}
