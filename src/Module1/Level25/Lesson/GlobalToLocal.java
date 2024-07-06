package Module1.Level25.Lesson;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class GlobalToLocal {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime cairoTime = ZonedDateTime.now(zone);
        System.out.println(cairoTime);  //=> 2024-07-06T17:57:56.673579600+03:00[Africa/Cairo]

        LocalDate localDate = cairoTime.toLocalDate();
        LocalTime localTime = cairoTime.toLocalTime();
        LocalDateTime localDateTime = cairoTime.toLocalDateTime();

        System.out.println(localDate);  //=> 2024-07-06
        System.out.println(localTime);  //=> 17:57:56.673579600
        System.out.println(localDateTime);  //=> 2024-07-06T17:57:56.673579600
    }
}
