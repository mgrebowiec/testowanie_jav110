import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PeselUtilTest {

    @Test
    void shouldReturnNullForNullPesel() {
        //given
        String samplePesel = null;

        //when
        LocalDate resultBirthDate = PeselUtil.getBirthDate(samplePesel);

        //then
        assertNull(resultBirthDate);
    }

    @Test
    void shouldReturnNullForEmptyPesel() {
        //given
        String samplePesel = "";

        //when
        LocalDate resultBirthDate = PeselUtil.getBirthDate(samplePesel);

        //then
        assertNull(resultBirthDate);
    }

    @Test
    void shouldReturnNullForTooLongPesel() {
        //given
        String samplePesel = "12345678912345";

        //when
        LocalDate resultBirthDate = PeselUtil.getBirthDate(samplePesel);

        //then
        assertNull(resultBirthDate);
    }

    @Test
    void shouldReturnNullForTooShortPesel() {
        //given
        String samplePesel = "1234567";

        //when
        LocalDate resultBirthDate = PeselUtil.getBirthDate(samplePesel);

        //then
        assertNull(resultBirthDate);
    }

    @Test
    void shouldReturnValidBirthDateForCorrectPesel() {
        //given
        String samplePesel = "84093011111";

        //when
        LocalDate resultBirthDate = PeselUtil.getBirthDate(samplePesel);

        //then
        assertEquals(LocalDate.of(1984, 9, 30), resultBirthDate);
    }

    @Test
    void shouldThrowExceptionForPeselWithWrongDate() {
        //given
        String samplePesel = "84133011111";

        //when (to jest tez sekcja then)
        assertThrows(DateTimeException.class, () -> {PeselUtil.getBirthDate(samplePesel);});
    }

}