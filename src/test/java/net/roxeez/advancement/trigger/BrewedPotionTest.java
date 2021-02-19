package net.roxeez.advancement.trigger;

import net.roxeez.advancement.data.PotionType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BrewedPotion tests")
public class BrewedPotionTest extends TriggerTest<BrewedPotion> {

    @Override
    protected TriggerWrapper<BrewedPotion> getTrigger() {
        return TriggerType.BREWED_POTION;
    }

    @Override
    protected BrewedPotion getObject() {
        BrewedPotion object = new BrewedPotion();

        object.setPotion(PotionType.LUCK);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"potion\":\"minecraft:luck\"}";
    }

}
