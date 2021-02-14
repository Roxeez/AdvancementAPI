package net.roxeez.advancement.data;

import net.roxeez.advancement.TestBase;
import net.roxeez.advancement.common.Dimension;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ChangedDimension tests")
public class ChangedDimensionDataTest extends TestBase {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    @DisplayName("Check if ChangedDimension is correctly serialized")
    public void serialization() {
        ChangedDimensionData object = new ChangedDimensionData();

        object.from(Dimension.OVERWORLD);
        object.to(Dimension.THE_NETHER);

        String serialized = serializer.serialize(object);
        Assertions.assertEquals("{\n" +
                                        "  \"from\": \"overworld\",\n" +
                                        "  \"to\": \"the_nether\"\n" +
                                        "}", serialized);
    }

}
