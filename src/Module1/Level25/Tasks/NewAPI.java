package Module1.Level25.Tasks;

import java.time.LocalDate;
import java.time.Month;

/***** Освоение нового API *****
 * В классе Solution реализуй 4 метода:
 * -----
 *  метод nowExample должен вернуть текущую дату;
 *  остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.
 * Требования:
 * • Метод nowExample должен вернуть текущую дату.
 * • Метод ofExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.of.
 * • Метод ofYearDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofYearDay.
 * • Метод ofEpochDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofEpochDay.
 */

public class NewAPI {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    /**
     * Метод возвращает текущую дату
     * @return - объект LocalDate
     */
    static LocalDate nowExample() {
        return LocalDate.now();
    }

    /**
     * Возвращает дату 12 сентября 2020 года с помощью метода LocalDate.of
     * @return - объект LocalDate
     */
    static LocalDate ofExample() {
        return LocalDate.of(2020, Month.SEPTEMBER, 12);
    }

    /**
     * Возвращает дату 12 сентября 2020 года с помощью метода LocalDate.ofYearDay
     * @return - объект LocalDate
     */
    static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(2020, 256);
    }

    /**
     * Возвращает дату 12 сентября 2020 года с помощью метода LocalDate.ofEpochDay
     * @return - объект LocalDate
     */
    static LocalDate ofEpochDayExample() {
        return LocalDate.ofEpochDay(18517);
    }
}


























