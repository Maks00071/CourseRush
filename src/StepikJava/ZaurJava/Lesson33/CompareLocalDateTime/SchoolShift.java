package StepikJava.ZaurJava.Lesson33.CompareLocalDateTime;

import java.time.*;


public class SchoolShift {

    public static void shift(LocalDate beginning, LocalDate ending, Period interval) {
        LocalDate currentDate = beginning;

        while(currentDate.isBefore(ending)) {
            System.out.println("The date is " + currentDate + ". It's time to change the school duty officer");
            currentDate = currentDate.plus(interval);
        }
    }

}
