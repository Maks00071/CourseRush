package Module1.Level25.Tasks.ModuleOfTasks;

import java.util.Scanner;

/**
 * Программа должна считывать целые числа с клавиатуры до тех пор,
 * пока не будет введено что-то другое: например, строка или символ.
 * Выведи на экран максимальное четное число из введенных.
 * Если введено несколько таких чисел, необходимо вывести любое из них.
 * -----
 * Пример ввода:
 * 8
 * 9
 * 8
 * 4
 * 5
 * e
 * -----
 * Пример вывода:
 * 8
 * Требования:
 * • Программа должна считывать числа c клавиатуры.
 * • Программа должна выводить число на экран.
 * • Программа должна выводить на экран максимальное четное из введенных целых чисел.
 * • Если введено несколько максимальных четных чисел, необходимо вывести любое.
 * • Если среди введенных символов нет четного числа или введен
 *   только один не числовой символ, то вывести на экран минимальное значение числа типа int.
 * • Считывать данные с клавиатуры необходимо в цикле while.
 */

public class MaxOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            if ((inputNumber % 2 == 0) && maxNumber < inputNumber) {
                maxNumber = inputNumber;
            }
        }
        System.out.println(maxNumber);
    }
}
















