package StepikJava.ZaurJava.Course1.Lesson14;

public class Hours {

    public static void printFromHourTo(int fromHour, int toHour) {
        OUTER:
        for (int hour = fromHour; hour < toHour; hour++) {
            INNER:
            for (int minute = 0; minute < 60; minute++) {
                if (hour - 10 < 0) {
                    if (minute - 10 < 0) {
                        System.out.println("0" + hour + ":0" + minute);
                    } else {
                        System.out.println("0" + hour + ":" + minute);
                    }
                } else {
                    if (minute - 10 < 0) {
                        System.out.println(hour + ":0" + minute);
                    } else {
                        System.out.println(hour + ":" + minute);
                    }
                }
            }
        }
    }

}






















