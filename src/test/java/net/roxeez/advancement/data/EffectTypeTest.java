package net.roxeez.advancement.data;

public class EffectTypeTest extends DataTest<EffectType> {

    @Override
    protected EffectType getObject() {
        return EffectType.ABSORPTION;
    }

    @Override
    protected String getJson() {
        return "\"minecraft:absorption\"";
    }

}
