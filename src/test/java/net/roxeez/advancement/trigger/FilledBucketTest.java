package net.roxeez.advancement.trigger;

import org.bukkit.Material;

public class FilledBucketTest extends TriggerTest<FilledBucket> {

    @Override
    protected FilledBucket getObject() {
        FilledBucket object = new FilledBucket();
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
    protected Trigger<FilledBucket> getTrigger() {
        return TriggerType.FILLED_BUCKET;
    }

}
