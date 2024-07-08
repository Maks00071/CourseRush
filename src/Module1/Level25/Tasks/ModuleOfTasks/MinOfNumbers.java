package Module1.Level25.Tasks.ModuleOfTasks;

import java.util.Scanner;

/**
 * Чтобы выполнить эту задачу, тебе нужно:
 * -----
 * Ввести с клавиатуры число N.
 * Считать N целых чисел и заполнить ими массив.
 * Найти минимальное число среди элементов массива и вывести в консоль.
 * Требования:
 * • В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
 * • В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
 */

public class MinOfNumbers {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int theNextNumber = scanner.nextInt();
            array[i] = theNextNumber;
            if (minNumber > theNextNumber) {
                minNumber = theNextNumber;
            }
        }
        System.out.println(minNumber);
    }
}














