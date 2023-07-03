package net.roxeez.advancement;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import net.roxeez.advancement.event.AdvancementsCreateEvent;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class used to register and manage all advancement created by a plugin
 */
public class AdvancementManager {

    private final Plugin plugin;
    private final ObjectSerializer serializer = new ObjectSerializer();
    private final Map<NamespacedKey, Advancement> advancements = new LinkedHashMap<>();

    /**
     * Create a new AdvancementManager instance for this plugin
     *
     * @param plugin Plugin instance
     */
    public AdvancementManager(@NotNull Plugin plugin) {
        Preconditions.checkNotNull(plugin);
        this.plugin = plugin;
    }

    /**
     * Get all registered advancements of this plugin
     *
     * @return Registered advancements of this plugin
     */
    @NotNull
    public ImmutableList<Advancement> getAdvancements() {
        return ImmutableList.copyOf(advancements.values());
    }

    /**
     * Get a registered advancement of this plugin by id
     *
     * @param id Id of this advancement
     * @return Advancement with this id or null if none
     */
    @Nullable
    public Advancement getAdvancement(@NotNull String id) {
        Preconditions.checkNotNull(id);
        return advancements.get(new NamespacedKey(plugin, id));
    }

    /**
     * Register an advancement using a AdvancementCreator
     *
     * @param creator AdvancementCreator instance of this advancement
     */
    public void register(@NotNull AdvancementCreator creator) {
        Preconditions.checkNotNull(creator);
        Advancement advancement = creator.create(new Context(plugin, advancements));
        this.advancements.put(advancement.getKey(), advancement);
    }

    /**
     * Registers an Advancement
     *
     * @param advancement The Advancement to register
     */
    public void register(@NotNull Advancement advancement) {
        Preconditions.checkNotNull(advancement);
        advancements.put(advancement.getKey(), advancement);
    }

    /**
     * Create all registered advancements
     *
     * @param clean If previously generated advancements should be removed.
     */
    @SuppressWarnings("deprecation")
    public void createAll(boolean clean) {
        if (clean) {
            plugin.getLogger().info("[AdvancementAPI] Cleaning previously generated advancements");
            for (Advancement advancement : this.advancements.values()) {
                if (Bukkit.getAdvancement(advancement.getKey()) != null) {
                    Bukkit.getUnsafe().removeAdvancement(advancement.getKey());
                }
            }

            Bukkit.reloadData();
        }

        plugin.getLogger().info("[AdvancementAPI] Generating advancements");
        for (Advancement advancement : this.advancements.values()) {
            if (Bukkit.getAdvancement(advancement.getKey()) == null) {
                Bukkit.getUnsafe().loadAdvancement(advancement.getKey(), serializer.serialize(advancement));
            }
        }

        Bukkit.reloadData();
        Bukkit.getServer().getPluginManager().callEvent(new AdvancementsCreateEvent());
    }

}
