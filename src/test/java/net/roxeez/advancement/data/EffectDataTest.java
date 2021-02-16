package net.roxeez.advancement.data;

public class EffectDataTest extends DataTest<EffectData> {

    @Override
    protected EffectData getObject() {
        EffectData object = new EffectData();
        object.setAmplifier(10);
        object.setDuration(10);
        return object;
    }

    @Override
    protected String getJson() {
        return "{\"amplifier\":{\"min\":10},\"duration\":{\"min\":10}}";
    }

}
