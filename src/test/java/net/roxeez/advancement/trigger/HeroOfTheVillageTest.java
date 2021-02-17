package net.roxeez.advancement.trigger;

import org.bukkit.block.Biome;

public class HeroOfTheVillageTest extends TriggerTest<HeroOfTheVillage> {

    @Override
    protected HeroOfTheVillage getObject() {
        HeroOfTheVillage object = new HeroOfTheVillage();
        object.setLocation(location -> {
            location.setBiome(Biome.BEACH);
        });
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"location\":{\"biome\":\"minecraft:beach\",\"smokey\":false}}";
    }

    @Override
    protected Trigger<HeroOfTheVillage> getTrigger() {
        return TriggerType.HERO_OF_THE_VILLAGE;
    }

}
