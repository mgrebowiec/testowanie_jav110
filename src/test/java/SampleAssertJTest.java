import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleAssertJTest {

    @Test
    void sampleTest() {
        String sampleValue = "  ";

        Assertions.assertThat(sampleValue)
                .isNotNull()
                .hasSize(2);

        // to samo co wyżej tylko przy użyciu asercji JUnit:
        org.junit.jupiter.api.Assertions.assertNotNull(sampleValue);
        org.junit.jupiter.api.Assertions.assertEquals(2, sampleValue.length());
    }

}
