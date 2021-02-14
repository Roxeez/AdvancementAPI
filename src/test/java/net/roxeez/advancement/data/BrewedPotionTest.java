package net.roxeez.advancement.data;

import net.roxeez.advancement.common.Potion;
import net.roxeez.advancement.trigger.Trigger;
import net.roxeez.advancement.trigger.TriggerType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BrewedPotion tests")
public class BrewedPotionTest extends TriggerTest<BrewedPotionData> {

    @Override
    protected Trigger<BrewedPotionData> getTrigger() {
        return TriggerType.BREWED_POTION;
    }

    @Override
    protected BrewedPotionData getObject() {
        BrewedPotionData object = new BrewedPotionData();

        object.potion(Potion.LUCK);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"potion\":\"minecraft:luck\"}";
    }

}
