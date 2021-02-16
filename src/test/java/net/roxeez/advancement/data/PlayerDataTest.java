package net.roxeez.advancement.data;

import org.bukkit.GameMode;

public class PlayerDataTest extends DataTest<PlayerData> {

    @Override
    protected PlayerData getObject() {
        PlayerData object = new PlayerData();
        object.setGameMode(GameMode.ADVENTURE);
        object.setLevel(10);
        object.setRecipe("test", true);
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"gamemode\":\"adventure\",\"level\":{\"min\":10},\"recipes\":{\"\\\"test\\\"\":true}}";
    }

}
