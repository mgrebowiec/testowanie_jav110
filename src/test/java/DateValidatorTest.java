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

    @Test
    void shouldReturnFalseForDateBeforeRange() {
        //given
        LocalDate sampleDate = LocalDate.of(2020, 12,30);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForDateAfterRange() {
        //given
        LocalDate sampleDate = LocalDate.of(2021, 4, 2);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForMinDate() {
        //given
        LocalDate sampleDate = LocalDate.of(2021, 1, 1);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForMaxDate() {
        //given
        LocalDate sampleDate = LocalDate.of(2021, 4, 1);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForDateInRange() {
        //given
        LocalDate sampleDate = LocalDate.of(2021, 2, 4);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        assertTrue(result);
    }
}