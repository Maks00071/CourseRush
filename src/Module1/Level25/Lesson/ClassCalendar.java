package Module1.Level25.Lesson;

import java.util.Calendar;

public class ClassCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int era = calendar.get(Calendar.ERA);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("era = " + era);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
    }
}
