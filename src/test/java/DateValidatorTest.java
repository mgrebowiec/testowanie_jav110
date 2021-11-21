import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateValidatorTest {

    @Test
    void shouldReturnFalseForNullDate() {
        //given
        LocalDate sampleDate = null;

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        assertFalse(result);
    }
}