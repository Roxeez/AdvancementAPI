package net.roxeez.advancement.data;

import org.bukkit.Material;

public class EquipmentDataTest extends DataTest<EquipmentData> {

    @Override
    protected EquipmentData getObject() {
        EquipmentData object = new EquipmentData();

        object.setMainHand(item -> {
            item.setType(Material.DIAMOND_SWORD);
        });

        object.setChest(item -> {
            item.setType(Material.IRON_CHESTPLATE);
        });

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"mainhand\":{\"item\":\"minecraft:diamond_sword\"},\"chest\":{\"item\":\"minecraft:iron_chestplate\"}}";
    }

}
