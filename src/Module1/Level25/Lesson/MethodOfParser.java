package Module1.Level25.Lesson;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class MethodOfParser {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse("February-23-2019", dateFormatter);
        System.out.println("Parse of date = " + date);  //=> Parse of date = 2019-02-23

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse("15:03:59", timeFormatter);
        System.out.println("Parse of time = " + time);  //=> Parse of time = 15:03:59
    }
}
