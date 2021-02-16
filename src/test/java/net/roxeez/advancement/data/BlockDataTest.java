package net.roxeez.advancement.data;

import org.bukkit.Material;

public class BlockDataTest extends DataTest<BlockData> {

    @Override
    protected BlockData getObject() {
        BlockData object = new BlockData();
        object.setType(Material.BEDROCK);
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"block\":\"minecraft:bedrock\"}";
    }

}
