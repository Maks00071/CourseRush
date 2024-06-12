package Module1.Level23.Tasks;

import java.util.Scanner;
import java.io.*;

/***** Пропускаем не всех *****
 * Напиши программу, которая считывает из консоли имя текстового файла (используй Scanner),
 * далее читает строки из этого файла (используй BufferedReader)
 * и выводит их на экран через одну, начиная с первой.
 *
 * Требования:
 * •Программа должна считать из консоли путь к файлу.
 * •Программа должна вывести в консоли содержимое файла согласно условию.
 * •Для чтения строк из файла должен быть использован BufferedReader.
 * •Поток чтения BufferedReader должен быть закрыт.
 */

public class NotEveryone {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
             FileReader input = new FileReader(scanner.nextLine());
             BufferedReader reader = new BufferedReader(input)) {

            int counter = 0;

            while (reader.ready()) {
                String line = reader.readLine();
                if (counter % 2 == 0) {
                    System.out.println(line);
                }
                counter++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}





















