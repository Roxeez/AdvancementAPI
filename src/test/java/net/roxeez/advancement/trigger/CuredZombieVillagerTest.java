package net.roxeez.advancement.trigger;

import org.junit.jupiter.api.DisplayName;

@DisplayName("CuredZombieVillager tests")
public class CuredZombieVillagerTest extends TriggerTest<CuredZombieVillager> {

    @Override
    protected CuredZombieVillager getObject() {
        CuredZombieVillager object = new CuredZombieVillager();

        object.setVillager(entity -> {
            entity.setDistance(distance -> {
                distance.setHorizontal(10);
            });
        });

        object.setZombie(entity -> {
            entity.setDistance(distance -> {
                distance.setAbsolute(10);
            });
        });

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"villager\":{\"distance\":{\"horizontal\":{\"min\":10.0}}},\"zombie\":{\"distance\":{\"absolute\":{\"min\":10.0}}}}";
    }

    @Override
    protected Trigger<CuredZombieVillager> getTrigger() {
        return TriggerType.CURED_ZOMBIE_VILLAGER;
    }

}
