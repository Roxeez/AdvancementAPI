package net.roxeez.advancement.data;

import org.bukkit.StructureType;
import org.bukkit.block.Biome;

public class LocationDataTest extends DataTest<LocationData> {

    @Override
    protected LocationData getObject() {
        LocationData object = new LocationData();
        object.setBiome(Biome.BADLANDS);
        object.setFeature(StructureType.BASTION_REMNANT);
        object.setSmokey(true);
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"biome\":\"minecraft:badlands\",\"feature\":\"bastion_remnant\",\"smokey\":true}";
    }

}
