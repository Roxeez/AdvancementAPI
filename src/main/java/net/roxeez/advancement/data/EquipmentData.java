package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.function.Consumer;

public class EquipmentData {

    @Expose
    @SerializedName("mainhand")
    private ItemData mainHand;

    @Expose
    @SerializedName("offhand")
    private ItemData offHand;

    @Expose
    @SerializedName("head")
    private ItemData head;

    @Expose
    @SerializedName("chest")
    private ItemData chest;

    @Expose
    @SerializedName("legs")
    private ItemData legs;

    @Expose
    @SerializedName("feet")
    private ItemData feet;

    public void setMainHand(Consumer<ItemData> consumer) {
        this.mainHand = new ItemData();
        consumer.accept(mainHand);
    }

    public void setOffHand(Consumer<ItemData> consumer) {
        this.offHand = new ItemData();
        consumer.accept(offHand);
    }

    public void setHead(Consumer<ItemData> consumer) {
        this.head = new ItemData();
        consumer.accept(head);
    }

    public void setChest(Consumer<ItemData> consumer) {
        this.chest = new ItemData();
        consumer.accept(chest);
    }

    public void setLegs(Consumer<ItemData> consumer) {
        this.legs = new ItemData();
        consumer.accept(legs);
    }

    public void setFeet(Consumer<ItemData> consumer) {
        this.feet = new ItemData();
        consumer.accept(feet);
    }

}
