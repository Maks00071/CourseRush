package StepikJava.ZaurJava.Lesson15.CycleWhile;

public class CycleDoWhile {

    public static void Clock(int hour) {

        OUTER:
        do {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour < 24);
    }



    public static void main(String[] args) {

        CycleDoWhile.Clock(12);

    }
}
