package net.roxeez.advancement.display;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;
import java.util.function.Consumer;

/**
 * Represent an advancement display
 */
public class Display {

    /**
     * Title of this advancement
     */
    @Expose
    @SerializedName("title")
    private String title = "UNDEFINED";

    /**
     * Description of this advancement
     */
    @Expose
    @SerializedName("description")
    private String description = "UNDEFINED";

    /**
     * Icon of this advancement
     */
    @Expose
    @SerializedName("icon")
    private Icon icon;

    /**
     * Background of this advancement
     */
    @Expose
    @SerializedName("background")
    private NamespacedKey background;

    /**
     * Frame of this advancement
     */
    @Expose
    @SerializedName("frame")
    private Frame frame;

    /**
     * Define if toast is displayed when unlocking this advancement
     */
    @Expose
    @SerializedName("show_toast")
    private boolean toast = true;

    /**
     * Define if an announce is made when unlocking this advancement
     */
    @Expose
    @SerializedName("announce_to_chat")
    private boolean announce = true;

    /**
     * Define if this advancement is hidden
     */
    @Expose
    @SerializedName("hidden")
    private boolean hidden = false;

    /**
     * Set title of this advancement
     *
     * @param title Title of advancement
     */
    public void setTitle(@NotNull String title) {
        Preconditions.checkNotNull(title);
        this.title = title;
    }

    /**
     * Set description of this advancement
     *
     * @param description Description of advancement
     */
    public void setDescription(@NotNull String description) {
        Preconditions.checkNotNull(description);
        this.description = description;
    }

    /**
     * Set frame of this advancement
     *
     * @param frame Frame of advancement
     */
    public void setFrame(@NotNull Frame frame) {
        Preconditions.checkNotNull(frame);
        this.frame = frame;
    }

    /**
     * Set icon of this advancement
     * This method will set icon and then call provided consumer on it
     *
     * @param consumer Consumer to execute on icon
     */
    public void setIcon(@NotNull Consumer<Icon> consumer) {
        Preconditions.checkNotNull(consumer);
        Icon icon = new Icon();
        consumer.accept(icon);

        this.icon = icon;
    }

    /**
     * Shortcut to only set and item as icon
     *
     * @param material Item of advancement icon
     */
    public void setIcon(@NotNull Material material) {
        Preconditions.checkNotNull(material);

        Icon icon = new Icon();
        icon.setItem(material);

        this.icon = icon;
    }

    /**
     * Set background of this advancement
     * This method works only for root advancement and will set tab background
     *
     * @param background Background of this advancement
     */
    public void setBackground(@NotNull BackgroundType background) {
        Preconditions.checkNotNull(background);
        this.background = background.getTexture();
    }

    /**
     * Set background of this advancement
     * This method works only for root advancement and will set tab background
     *
     * @param key Key of the background
     */
    public void setBackground(@NotNull NamespacedKey key) {
        Preconditions.checkNotNull(key);
        this.background = key;
    }

    /**
     * Set if toast should be displayed or not when completing this advancement
     *
     * @param toast True if displayed false if not
     */
    public void toast(boolean toast) {
        this.toast = toast;
    }

    /**
     * Set if announce in chat should be made when completing this advancement
     *
     * @param announce True if yes false if not
     */
    public void announce(boolean announce) {
        this.announce = announce;
    }

    /**
     * Set if this advancement is hidden
     *
     * @param hidden True if hidden false if visible
     */
    public void hidden(boolean hidden) {
        this.hidden = hidden;
    }

}
