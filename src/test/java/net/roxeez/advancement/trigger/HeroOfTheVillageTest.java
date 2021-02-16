package net.roxeez.advancement.trigger;

import org.bukkit.block.Biome;

public class HeroOfTheVillageTest extends TriggerTest<HeroOfTheVillageData> {

    @Override
    protected HeroOfTheVillageData getObject() {
        HeroOfTheVillageData object = new HeroOfTheVillageData();
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
    protected Trigger<HeroOfTheVillageData> getTrigger() {
        return TriggerType.HERO_OF_THE_VILLAGE;
    }

}
