package StepikJava.ZaurJava.Course1.Lesson14.Homework;

public class HomeHours {

    public static void printTime(int fromHour, int toHour) {
        HOUR:
        for (int hour = fromHour; hour < toHour; hour++) {
            MINUTE:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && (minute % 10 == 0)) {
                    break HOUR;
                }
                SECOND:
                for (int second = 0; second < 60; second++) {
                    if ((second * hour) > minute) {
                        continue MINUTE;
                    }

                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        HomeHours.printTime(0, 6);
    }

}
