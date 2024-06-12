package Module1.Level23.Tasks;

import java.io.*;
import java.util.Scanner;


/***** Фейсконтроль *****
 * Напиши программу, которая считывает из консоли имя текстового файла,
 * далее читает символы из этого файла (используй FileReader) и выводит на экран все,
 * за исключением точки, запятой и пробела.
 *
 * Требования:
 * •Программа должна считать из консоли путь к файлу.
 * •Программа должна вывести в консоли содержимое файла согласно условию.
 * •Для чтения символов из файла должен быть использован FileReader.
 * •Поток чтения FileReader должен быть закрыт.
 */

public class FaceControl {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
             FileReader reader = new FileReader(scanner.nextLine())) {

            while (reader.ready()) {
                char elem = (char) reader.read();
                if (elem != '.' && elem != ',' && elem != ' ') {
                    System.out.print(elem);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



















