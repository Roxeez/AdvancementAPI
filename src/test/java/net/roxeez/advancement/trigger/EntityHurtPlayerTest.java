package net.roxeez.advancement.trigger;

import org.bukkit.entity.EntityType;

public class EntityHurtPlayerTest extends TriggerTest<EntityHurtPlayerData> {

    @Override
    protected EntityHurtPlayerData getObject() {
        EntityHurtPlayerData object = new EntityHurtPlayerData();

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
    protected Trigger<EntityHurtPlayerData> getTrigger() {
        return TriggerType.ENTITY_HURT_PLAYER;
    }

}
