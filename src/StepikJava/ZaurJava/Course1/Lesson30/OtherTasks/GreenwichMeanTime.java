package StepikJava.ZaurJava.Course1.Lesson30.OtherTasks;

public class GreenwichMeanTime {
    public static void main(String[] args) {
        final int MILLISECONDS_PER_SECOND = 1000; // 1 секунда содержит 1000 миллисекунд
        final int SECONDS_PER_MINUTE = 60; // 1 минута = 60 секунд
        final int MINUTES_PER_HOUR = 60; // 1 час = 60 минут
        final int HOURS_PER_DAY = 24; // 1 сутки = 24 часа

        // входные данные
        long totalMilliseconds; // общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970

        // выходные данные
        long currentHour;   // текущее кол-во часов по Гринвичу
        long currentMinute; // текущее кол-во минут
        long currentSecond; // текущее кол-во секунд

        // промежуточные переменные
        long totalSeconds;  // общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        long totalMinutes;  // общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        long totalHours;    // общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970

        // общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970
        totalMilliseconds = System.currentTimeMillis();

        // общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;

        // текущее кол-во секунд
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;

        // общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;

        // текущее кол-во минут
        currentMinute = totalMinutes % MINUTES_PER_HOUR;

        // общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970
        totalHours = totalMinutes / MINUTES_PER_HOUR;

        // текущее кол-во часов по Гринвичу
        currentHour = totalHours % HOURS_PER_DAY;

        // текущее время по Гринвичу
        System.out.println("Текущее время по Гринвичу: " + currentHour + ":" + currentMinute + ":"
                + currentSecond + "GMT.");
    }
}
































