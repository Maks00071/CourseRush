package StepikJava.ZaurJava.Course1.Lesson33.ClassLocalDateTime;

import java.time.*;


public class ClassLocalDateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now()); // "2024-11-03"
        System.out.println(LocalTime.now()); // "22:34:24.887568700"
        System.out.println(java.time.LocalDateTime.now()); // "2024-11-03T22:34:24.887568700"

        System.out.println("--------------------LocalDate------------------------");

        LocalDate ld1 = LocalDate.of(2015, 3, 8);
        System.out.println(ld1); // "2015-03-08"

        LocalDate ld2 = LocalDate.of(2020, Month.APRIL, 3);
        System.out.println(ld2); // "2020-04-03"

        System.out.println("--------------------LocalTime------------------------");

        LocalTime lt1 = LocalTime.of(5, 56);
        System.out.println(lt1); // "05:56"

        LocalTime lt2 = LocalTime.of(15, 30, 25);
        System.out.println(lt2); // "15:30:25"

        LocalTime lt3 = LocalTime.of(12, 45, 31, 69568);
        System.out.println(lt3); // "12:45:31.000069568"

        System.out.println("--------------------LocalDateTime------------------------");

        LocalDateTime ldt1 = LocalDateTime.of(2019, 2, 25, 15, 30);
        System.out.println(ldt1); // "2019-02-25T15:30"

        LocalDateTime ldt2 = LocalDateTime.of(2015, Month.FEBRUARY, 27, 14, 25, 36, 956434);
        System.out.println(ldt2); // "2015-02-27T14:25:36.000956434"

        LocalDateTime ldt3 = LocalDateTime.of(ld2, lt3);
        System.out.println(ldt3); // "2020-04-03T12:45:31.000069568"

        System.out.println("--------------------MethodsOfLocalDate------------------------");

        ld1 = ld1.plusDays(15);
        System.out.println(ld1); // "2015-03-23"

        ld1 = ld1.minusDays(1);
        System.out.println(ld1); // "2015-03-22"

        ld2 = ld2.plusWeeks(2);
        System.out.println(ld2); // "2020-04-17"
    }
}























