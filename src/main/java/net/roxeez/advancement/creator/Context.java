package net.roxeez.advancement.creator;

import com.google.common.base.Preconditions;
import net.roxeez.advancement.Advancement;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Map;

/**
 * Context containing some useful information for creating advancement
 */
public class Context {

    private final Plugin plugin;
    private final Map<NamespacedKey, Advancement> advancements;

    /**
     * Create a new context
     *
     * @param plugin       Plugin instance
     * @param advancements All registered advancements
     */
    public Context(@NotNull Plugin plugin, @NotNull Map<NamespacedKey, Advancement> advancements) {
        this.plugin = plugin;
        this.advancements = advancements;
    }

    /**
     * Get plugin instance
     *
     * @return Plugin instance
     */
    @NotNull
    public Plugin getPlugin() {
        return plugin;
    }

    /**
     * Get specific advancement by id
     *
     * @param id Id of advancement
     *
     * @return Advancement found or null if none
     */
    @Nullable
    public Advancement getAdvancement(@NotNull String id) {
        Preconditions.checkNotNull(id);
        return advancements.get(new NamespacedKey(plugin, id));
    }

}
