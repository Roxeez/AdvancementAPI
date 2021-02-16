package net.roxeez.advancement.data;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;


@DisplayName("ItemData tests")
public class ItemDataTest extends DataTest<ItemData> {

    @Override
    protected ItemData getObject() {
        ItemData item = new ItemData();

        item.setType(Material.POTION);
        item.setCount(10, 15);
        item.setDurability(10);
        item.setPotion(PotionType.INVISIBILITY);

        return item;
    }

    @Override
    protected String getJson() {
        return "{\"item\":\"minecraft:potion\",\"count\":{\"min\":10,\"max\":15},\"durability\":{\"min\":10},\"potion\":\"minecraft:invisibility\"}";
    }

}
