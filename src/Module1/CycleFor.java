package Module1;
import java.util.Scanner;


public class CycleFor {
    public static void main(String[] args) {
        // напишем программу, которая вводит с клавиатуры 5 строк и выводит на экран,
        // сколько из этих строк было чисел:
        Scanner scanner = new Scanner(System.in);

        int count = 0;  // заводим счетчик

        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) { // если ввели число, то счетчик +1
                count++;
            } scanner.nextLine();   // считываем строку и никуда ее не выводим/сохраняем
        }
        System.out.println(count);

        // Вычисление факториала:
        int f = 1;
        int number = scanner.nextInt(); // факториал какого числа будем искать

        for (int i = 1; i <= number; i++) {
            f = f * i;
        }
        System.out.println(f);

        // напишем программу, которая рисует на экране треугольник:
        // в первой строчке выводит 10 звездочек, во второй — 9 звездочек, затем 8, и т.д.:
        for (int i = 0; i < 10; i++) {
            int startCount = 10 - i;
            for (int j = 0; j < startCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
