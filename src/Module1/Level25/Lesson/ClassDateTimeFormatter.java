package Module1.Level25.Lesson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClassDateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String text = dtf.format(LocalDateTime.now());

        System.out.println(text);
    }
}
