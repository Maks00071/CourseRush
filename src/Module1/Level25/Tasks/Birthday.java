package Module1.Level25.Tasks;

import java.util.Calendar;
import java.util.GregorianCalendar;

/***** День недели рождения твоего *****
 * Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
 * Реализуй метод getDayOfWeek(Calendar calendar), чтобы он возвращал русское название
 * дня недели аргумента calendar.
 * Помни, что в григорианском календаре неделя начинается с воскресенья.
 * -----
 * Требования:
 * • Переменная birthDate должна быть проинициализирована при объявлении.
 * • Метод getDayOfWeek(Calendar calendar) должен возвращать день недели аргумента calendar.
 */

public class Birthday {

    static Calendar birthday = new GregorianCalendar(1987, Calendar.APRIL, 18);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthday));
    }

    /**
     * Метод возвращает русское название дня недели аргумента calendar
     * @param calendar - дата
     * @return - название месяца
     */
    public static String getDayOfWeek(Calendar calendar) {
        String result = "";
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        return switch(day) {
            case 1 -> "Воскресенье";
            case 2 -> "Понедельник";
            case 3 -> "Вторник";
            case 4 -> "Среда";
            case 5 -> "Четверг";
            case 6 -> "Пятница";
            case 7 -> "Суббота";
            default -> result;
        };
    }
}


















