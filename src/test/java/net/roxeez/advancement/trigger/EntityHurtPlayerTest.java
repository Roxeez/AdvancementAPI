package net.roxeez.advancement.trigger;

import org.bukkit.entity.EntityType;

public class EntityHurtPlayerTest extends TriggerTest<EntityHurtPlayer> {

    @Override
    protected EntityHurtPlayer getObject() {
        EntityHurtPlayer object = new EntityHurtPlayer();

        object.setDamage(damage -> {
            damage.setSource(EntityType.BEE);
            damage.setBlocked(true);
        });

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"damage\":{\"blocked\":true,\"source\":{\"type\":\"minecraft:bee\"}}}";
    }

    @Override
    protected TriggerWrapper<EntityHurtPlayer> getTrigger() {
        return TriggerType.ENTITY_HURT_PLAYER;
    }

}
