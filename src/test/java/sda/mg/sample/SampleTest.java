package sda.mg.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SampleTest {

    @Test
    void shouldCompareStringsSample() {
        //given
        String actualValue = "aa";

        //then
        assertNotNull(actualValue);
        assertEquals(new String("aa"), actualValue);
    }
}
