package Module1.Level25.Tasks.ModuleOfTasks;

import java.util.Arrays;
import java.io.IOException;

/***** Прямоугольник *****
 * В программе дан двумерный массив размером 5*6. Используя только метод fill класса Arrays,
 * заполни массив символами 'X' (большая латинская буква икс) и ' ' (пробел) так,
 * как показано в примере:
 * XXXXXX
 * X    X
 * X    X
 * X    X
 * XXXXXX
 * -----
 * Для решения этой задачи нельзя использовать циклы.
 * -----
 * Требования:
 * • В классе Solution должно быть публичное статическое поле array типа char[][],
 *   проинициализированное значением new char[5][6].
 * • Массив array необходимо заполнить согласно условию.
 * • В программе нужно использовать метод fill класса Arrays.
 */

public class Rectangle {

    public static char[][] array = new char[5][6];

    public static void main(String[] args) throws IOException {
        Arrays.fill(array[0], 'X');
        Arrays.fill(array[1], 'X');
        Arrays.fill(array[1], 1, 5, ' ');
        Arrays.fill(array[2], 'X');
        Arrays.fill(array[2], 1, 5, ' ');
        Arrays.fill(array[3], 'X');
        Arrays.fill(array[3], 1, 5, ' ');
        Arrays.fill(array[4], 'X');

        for (char[] line : array) {
            for (char elem : line) {
                System.out.print(elem);
            }
            System.out.println();
        }
    }
}













