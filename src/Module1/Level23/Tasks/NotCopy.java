package Module1.Level23.Tasks;

import java.io.*;
import java.util.Scanner;


/***** Что-то не копируется... *******
 * Есть программа, которая считывает из консоли путь к файлу1 и путь к файлу2
 * и копирует содержимое файла1 в файл2.
 * Но она не работает корректно. Найди и исправь ошибки в коде,
 * чтобы программа заработала как нужно.
 * Требования:
 * •Программа должна считать из консоли пути к файлам.
 * •Программа должна переписывать содержимое из одного файла в другой.
 * •Для чтения из файлов должен быть использован метод read() объекта FileInputStream.
 * •Для записи в файл должен быть использован метод write() объекта FileOutputStream.
 * •Потоки для чтения и записи должны быть закрыты.
 */

public class NotCopy {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);
            FileInputStream input = new FileInputStream(scanner.nextLine());
            FileOutputStream output = new FileOutputStream(scanner.nextLine())) {

            byte[] buffer = new byte[1024];
            while (input.available() > 0) {
                int read = input.read(buffer);
                output.write(buffer, 0, read);
            }

        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}






















