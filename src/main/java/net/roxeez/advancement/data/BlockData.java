package net.roxeez.advancement.data;

import org.bukkit.Material;

// TODO: Add tag/nbt/state properties
public class BlockData {

    private Material block;

    public void setType(Material material) {
        this.block = material;
    }
}
