package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.NamespacedKey;

public class RecipeUnlocked implements Trigger {

    @Expose
    @SerializedName("recipe")
    private NamespacedKey recipe;

    public void setRecipe(NamespacedKey recipe) {
        this.recipe = recipe;
    }

}
