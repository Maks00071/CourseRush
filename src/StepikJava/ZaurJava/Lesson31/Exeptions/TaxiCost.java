package StepikJava.ZaurJava.Lesson31.Exeptions;

import java.util.Scanner;


public class TaxiCost {
    public static void main(String[] args) {
        final double price = 8.5;

        int initialValue; // начальное значение одометра
        int finalValue; // конечное значение одометра
        int distance; // расстояние

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальные показания одометра: ");
        initialValue = scanner.nextInt();

        System.out.println("Введите конечные показания одометра: ");
        finalValue = scanner.nextInt();

        distance = finalValue - initialValue;

        System.out.println("Вы проехали " + distance + " км.");
        System.out.println("Из расчета 8 руб 50 коп за 1 км, стоимость проезда равна " + (int) (distance * price)
                + " руб " + (int)((distance * price - (int) (distance * price)) * 100) + " коп");
    }
}
