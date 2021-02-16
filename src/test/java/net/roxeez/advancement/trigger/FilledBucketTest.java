package net.roxeez.advancement.trigger;

import org.bukkit.Material;

public class FilledBucketTest extends TriggerTest<FilledBucketData> {

    @Override
    protected FilledBucketData getObject() {
        FilledBucketData object = new FilledBucketData();
        object.setItem(item -> {
            item.setType(Material.WATER_BUCKET);
        });
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"item\":{\"item\":\"minecraft:water_bucket\"}}";
    }

    @Override
    protected Trigger<FilledBucketData> getTrigger() {
        return TriggerType.FILLED_BUCKET;
    }

}
