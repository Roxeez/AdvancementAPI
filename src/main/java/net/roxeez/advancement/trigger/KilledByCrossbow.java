package net.roxeez.advancement.trigger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.roxeez.advancement.data.EntityData;
import net.roxeez.advancement.data.Range;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class KilledByCrossbow implements TriggerData {

    @Expose
    @SerializedName("unique_entity_types")
    private Range<Integer> uniqueEntityTypes;

    @Expose
    @SerializedName("victims")
    private List<EntityData> victims;

    public void addVictim(Consumer<EntityData> consumer) {
        if (this.victims == null) {
            this.victims = new ArrayList<>();
        }
        EntityData entity = new EntityData();
        consumer.accept(entity);
        victims.add(entity);
    }

    public void setUniqueEntityTypes(int value) {
        this.uniqueEntityTypes = new Range<>(value);
    }
}
