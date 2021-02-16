package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bukkit.StructureType;
import org.bukkit.block.Biome;
import java.util.function.Consumer;

public class LocationData {

    @Expose
    @SerializedName("biome")
    private Biome biome;

    @Expose
    @SerializedName("block")
    private BlockData block;

    @Expose
    @SerializedName("dimension")
    private DimensionType dimension;

    @Expose
    @SerializedName("feature")
    private StructureType feature;

    @Expose
    @SerializedName("light")
    private Range<Integer> light;

    @Expose
    @SerializedName("position")
    private PositionData position;

    @Expose
    @SerializedName("smokey")
    private boolean smokey;

    public void setBlock(Consumer<BlockData> consumer) {
        this.block = new BlockData();
        consumer.accept(block);
    }

    public void setLight(int light) {
        this.light = new Range<>(light);
    }

    public void setLight(int minimum, int maximum) {
        this.light = new Range<>(minimum, maximum);
    }

    public void setPosition(Consumer<PositionData> consumer) {
        this.position = new PositionData();
        consumer.accept(position);
    }

    public void setBiome(Biome biome) {
        this.biome = biome;
    }

    public void setDimension(DimensionType dimension) {
        this.dimension = dimension;
    }

    public void setFeature(StructureType feature) {
        this.feature = feature;
    }

    public void setSmokey(boolean smokey) {
        this.smokey = smokey;
    }

}
