package Module1.Level25.Lesson.WorkWithDateAndTime;

import java.time.Instant;

public class ClassInstant {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println(timestamp);  //=> 2024-07-06T11:16:22.421572700Z

        long n = timestamp.toEpochMilli();
        System.out.println(n);  //=> 1720264703302
        Instant time = Instant.ofEpochMilli(n);
        System.out.println(time);  //=> 2024-07-06T11:19:13.788Z
    }
}
