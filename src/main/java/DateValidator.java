import java.time.LocalDate;

public class DateValidator {
    public static boolean isValidDate(LocalDate date) {
        if (date == null) {
            return false;
        }

        if (LocalDate.of(2021, 1, 1).isAfter(date)) {
            return false;
        }

        if (LocalDate.of(2021, 4, 1).isBefore(date)) {
            return false;
        }

        return true;
    }
}
