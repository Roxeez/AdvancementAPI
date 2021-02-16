package net.roxeez.advancement.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlagsData {

    @Expose
    @SerializedName("is_on_fire")
    private boolean isOnFire;

    @Expose
    @SerializedName("is_sneaking")
    private boolean isSneaking;

    @Expose
    @SerializedName("is_sprinting")
    private boolean isSprinting;

    @Expose
    @SerializedName("is_swimming")
    private boolean isSwimming;

    @Expose
    @SerializedName("is_baby")
    private boolean isBaby;

    public void setOnFire(boolean onFire) {
        isOnFire = onFire;
    }

    public void setSneaking(boolean sneaking) {
        isSneaking = sneaking;
    }

    public void setSprinting(boolean sprinting) {
        isSprinting = sprinting;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public void setBaby(boolean baby) {
        isBaby = baby;
    }

}
