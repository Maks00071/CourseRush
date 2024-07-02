package Module1.Level25.Lesson;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClassGregorianCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 6);  //июль
        calendar.set(Calendar.DAY_OF_MONTH, 4);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 15);
        calendar.set(Calendar.SECOND, 0);

        System.out.println(calendar.getTime());  //Thu Jul 04 12:15:00 MSK 2019
    }
}
