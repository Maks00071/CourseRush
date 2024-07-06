package Module1.Level25.Lesson.WorkWithDateAndTime;

import java.time.LocalTime;

public class ClassLocalTime {
    public static void main(String[] args) {

        //получение текущего времени
        LocalTime localTime = LocalTime.now();
        System.out.println("Сегодня = " + localTime);  //=> Сегодня = 17:59:47.340814300

        //получение заданного времени
        LocalTime randomTime = LocalTime.of(12, 15, 0, 100);
        System.out.println("Установленное время = " + randomTime);  //=> Установленное время = 12:15:00.000000100

        //получение времени по кол-ву секунд
        LocalTime secondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println(secondTime);  //=> 02:46:40

        System.out.println("---------------------------------");

        //получение фрагментов даты
        LocalTime newTime = LocalTime.now();
        System.out.println("Локальное время = " + newTime);
        System.out.println("Часы = " + newTime.getHour());
        System.out.println("Минуты = " + newTime.getMinute());
        System.out.println("Секунды = " + newTime.getSecond());
        System.out.println("Наносекунды = " + newTime.getNano());

        System.out.println("---------------------------------");

        //изменение времени в объекте класса LocalTime
        LocalTime testTime = LocalTime.now();
        LocalTime time2 = testTime.plusHours(2);
        LocalTime time3 = testTime.minusMinutes(40);
        LocalTime time4 = testTime.plusSeconds(3600);

        System.out.println(testTime);  //=> 18:25:50.193360300
        System.out.println(time2);  //=> 20:25:50.193360300
        System.out.println(time3);  //=> 17:45:50.193360300
        System.out.println(time4);  //=> 19:25:50.193360300
    }
}


















