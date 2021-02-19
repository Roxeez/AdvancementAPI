package net.roxeez.advancement.data;

import org.bukkit.GameMode;
import org.bukkit.NamespacedKey;

public class PlayerDataTest extends DataTest<PlayerData> {

    @Override
    protected PlayerData getObject() {
        PlayerData object = new PlayerData();
        object.setGameMode(GameMode.ADVENTURE);
        object.setLevel(10);
        object.setRecipe(NamespacedKey.minecraft("stone"), true);
        return object;
    }

    @Override
    protected String getJson() {
        return "{\n" +
                "  \"gamemode\": \"adventure\",\n" +
                "  \"level\": {\n" +
                "    \"min\": 10\n" +
                "  },\n" +
                "  \"recipes\": {\n" +
                "    \"minecraft:stone\": true\n" +
                "  }\n" +
                "}";
    }

}
