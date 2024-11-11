package StepikJava.ZaurJava.Course1.Lesson33.CompareLocalDateTime;

import java.time.*;

public class RunSchoolShift {
    public static void main(String[] args) {
        LocalDate beginning = LocalDate.of(2015, Month.SEPTEMBER, 1);
        LocalDate ending = LocalDate.of(2016, Month.MAY, 31);
        Period interval = Period.ofMonths(1);

        SchoolShift.shift(beginning, ending, interval);
    }
}
