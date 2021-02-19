package net.roxeez.advancement.trigger;

import net.roxeez.advancement.data.EffectType;
import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BredAnimals tests")
public class BredAnimalsTest extends TriggerTest<BredAnimals> {

    @Override
    protected TriggerWrapper<BredAnimals> getTrigger() {
        return TriggerType.BRED_ANIMALS;
    }

    @Override
    protected BredAnimals getObject() {
        BredAnimals object = new BredAnimals();

        object.setParent(parent -> {
            parent.setLocation(location -> {
                location.setBiome(Biome.BEACH);
            });
        });
        object.setPartner(partner -> {
            partner.addEffect(EffectType.SPEED, effect -> {
                effect.setAmplifier(2);
            });
        });
        object.setChild(EntityType.MULE);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"child\":{\"type\":\"minecraft:mule\"},\"parent\":{\"location\":{\"biome\":\"minecraft:beach\",\"smokey\":false}},\"partner\":{\"effects\":{\"minecraft:speed\":{\"amplifier\":{\"min\":2}}}}}";
    }

}
