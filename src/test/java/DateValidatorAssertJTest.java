import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class DateValidatorAssertJTest {
    @Test
    void shouldReturnFalseForNullDate() {
        //given
        LocalDate sampleDate = null;

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        Assertions.assertThat(result)
                .isFalse();

    }

    @Test
    void shouldReturnFalseForDateBeforeRange() {
        //given
        LocalDate sampleDate = LocalDate.of(2020, 12,30);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        Assertions.assertThat(result)
                .isFalse();
    }

    @Test
    void shouldReturnFalseForDateAfterRange() {
        //given
        LocalDate sampleDate = LocalDate.of(2021, 4, 2);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        Assertions.assertThat(result)
                .isFalse();
    }

    @Test
    void shouldReturnTrueForMinDate() {
        //given
        LocalDate sampleDate = LocalDate.of(2021, 1, 1);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        Assertions.assertThat(result)
                .isTrue();
    }

    @Test
    void shouldReturnTrueForMaxDate() {
        //given
        LocalDate sampleDate = LocalDate.of(2021, 4, 1);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        Assertions.assertThat(result)
                .isTrue();
    }

    @Test
    void shouldReturnTrueForDateInRange() {
        //given
        LocalDate sampleDate = LocalDate.of(2021, 2, 4);

        //when
        boolean result = DateValidator.isValidDate(sampleDate);

        //then
        Assertions.assertThat(result)
                .isTrue();
    }
}