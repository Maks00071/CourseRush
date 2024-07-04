package Module1.Level25.Lesson.WorkWithDate;

import java.time.LocalDate;
import java.time.Month;

public class ClassLocalDate {
    public static void main(String[] args) {
        //получение актуальной даты
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня = " + today);  //=> Сегодня = 2024-07-04

        //получение конкретной даты
        LocalDate randomDate = LocalDate.of(2019, Month.FEBRUARY, 22);
        System.out.println(randomDate);  //=> 2019-02-22

        //получение даты по номеру дня
        LocalDate date = LocalDate.ofYearDay(2019, 100);
        System.out.println(date);  //=> 2019-04-10

        //получение даты Unix
        LocalDate unixDate = LocalDate.ofEpochDay(1);
        System.out.println("Unix time is " + unixDate);  //=> Unix time is 1970-01-02

        System.out.println("----------------------------------------------");

        //методы класса LocalDate
        LocalDate testToday = LocalDate.now();
        System.out.println("Тестовая дата = " + testToday);
        System.out.println("Год = " + testToday.getYear());
        System.out.println("Месяц = " + testToday.getMonth());
        System.out.println("Номер месяца = " + testToday.getMonthValue());
        System.out.println("День месяца = " + testToday.getDayOfMonth());
        System.out.println("День недели = " + testToday.getDayOfWeek());

        System.out.println("----------------------------------------------");

        //изменение даты
        LocalDate birthday = LocalDate.of(2019, 2, 28);
        LocalDate nextBirthday = birthday.plusYears(1);
        LocalDate firstBirthday = birthday.minusYears(30);

        System.out.println("День рождения = " + birthday);
        System.out.println("Следующий день рождения = " + nextBirthday);
        System.out.println("Первый день рождения = " + firstBirthday);
    }
}


















