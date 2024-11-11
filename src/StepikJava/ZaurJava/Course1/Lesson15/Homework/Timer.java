package StepikJava.ZaurJava.Course1.Lesson15.Homework;

public class Timer {

    public static void Clock(int fromHour, int toHour) {
        HOUR:
        while(fromHour < toHour) {
            int minute = 0;
            MINUTE:
            do {
                int second = 0;
                SECOND:
                while(second < 60) {
                    System.out.println(fromHour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;
            } while (minute < 60);
            fromHour++;
        }
    }

    public static void main(String[] args) {
        Timer.Clock(1, 3);
    }
}
