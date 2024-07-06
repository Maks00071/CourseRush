package Module1.Level25.Tasks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/***** Фильтруем выходные *****
 * Реализуй метод isWeekend. Он должен определять, относится ли параметр dateTime к выходным.
 * Считаем выходными промежуток между 22:00 пятницы (включительно) и 23:00 воскресенья (не включительно).
 * -----
 * Требования:
 * • Метод isWeekend должен вернуть true, если параметр dateTime попадает в заданный временной промежуток.
 * • Метод isWeekend должен вернуть false, если параметр dateTime не попадает в заданный временной промежуток.
 */

public class FilterForWeekend {

    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;
    public static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    public static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();

        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }
    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        int dayOfWeek = dateTime.getDayOfWeek().getValue();

        if (dayOfWeek == SATURDAY) {
            return true;
        }

        if (dayOfWeek == FRIDAY && dateTime.getHour() >= WEEKEND_START_FRIDAY_CUT_OFF_HOUR) {
            return true;
        }

        if (dayOfWeek == SUNDAY && dateTime.getHour() < WEEKEND_END_SUNDAY_CUT_OFF_HOUR) {
            return true;
        }
        return false;
    }
}
























