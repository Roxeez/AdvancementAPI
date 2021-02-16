package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.GameMode;
import java.util.HashMap;
import java.util.Map;

// TODO : Add stats & advancements
public class PlayerData {

    @Expose
    @SerializedName("gamemode")
    private GameMode gameMode;

    @Expose
    @SerializedName("level")
    private Range<Integer> level;

    @Expose
    @SerializedName("recipes")
    private Map<String, Boolean> recipes;

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public void setLevel(int level) {
        this.level = new Range<>(level);
    }

    public void setLevel(int minimum, int maximum) {
        this.level = new Range<>(minimum, maximum);
    }

    public void setRecipe(String id, boolean known) {
        if (this.recipes == null) {
            this.recipes = new HashMap<>();
        }

        this.recipes.put(id, known);
    }

}
