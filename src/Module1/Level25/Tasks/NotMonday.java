package Module1.Level25.Tasks;

import java.util.Calendar;
import java.util.Date;

/***** Лишь бы не в понедельник :) *****
 * Проинициализируй переменную birthDate объектом Date с датой своего рождения.
 * Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское
 * название дня недели аргумента date.
 * -----
 * Требования:
 * • Переменная birthDate должна быть проинициализирована при объявлении.
 * • Метод getDayOfWeek(Date date) должен возвращать русское название дня недели.
 */

public class NotMonday {

    static Date birthDate = new Date(1987, Calendar.APRIL, 17);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();

        switch(day) {
            case 0: return "Воскресенье";
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
        }
        return result;
    }
}






















