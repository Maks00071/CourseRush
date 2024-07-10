package Module1.Level25.Tasks.ModuleOfTasks;

import java.util.Scanner;

/***** Шахматная доска *****
 * Давай создадим программу для генерации квадратных шахматных досок с заданной размерностью.
 * В классе Solution дан двумерный массив символов (поле array). Необходимо:
 * -----
 * считать число с клавиатуры — это и будет размерность нашей будущей доски (длина стороны);
 * инициализировать массив array соответствующим значением;
 * "закрасить" массив так, чтобы получилась шахматная доска (черные клетки — '#', белые — ' ').
 * Начинаем заполнять массив с '#' с верхнего левого угла;
 * вывести массив на экран в таком виде, как в примере (каждую строку отдельно).
 * Пример вывода для числа 5:
 * # # #
 *  # #
 * # # #
 *  # #
 * # # #
 * -----
 * Требования:
 * • В программе нужно считывать число с клавиатуры.
 * • Поле array необходимо проинициализировать массивом подходящего размера.
 * • Массив array необходимо заполнить согласно условию.
 * • В программе нужно вывести элементы массива на экран (см. пример в условии).
 */

public class ChessBoard {

    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        array = new char[sizeArray][sizeArray];
        scanner.close();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (char[] elem : array) {
            for (char sym : elem) {
                System.out.print(sym);
            }
            System.out.println();
        }

    }
}

























