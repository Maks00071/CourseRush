package Module1.Level23.Tasks;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.Writer;
import java.util.Scanner;

/***** Пишем байты в файл *****
 * У тебя есть программа, которая считывает из консоли путь к файлу и записывает
 * в этот файл последовательность байтов, но в ней есть ошибка.
 *
 * Как ты уже знаешь, Writer "не работает" с байтами: для записи байтов в файл нужно
 * использовать FileOutputStream.
 *
 * Твоя задача — исправить программу.
 *
 * Требования:
 * • Программа должна считать из консоли путь к файлу.
 * • Программа должна переписывать байты в файл.
 * • Для записи байтов должен быть использован FileOutputStream.
 * • Поток для записи должен быть закры
 */

public class BytesToFile {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
            //Writer writer = new FileWriter(scanner.nextLine())
             FileOutputStream writer = new FileOutputStream(scanner.nextLine())) {

            byte[] bytes = new byte[]{106, 97, 118, 97};
            writer.write(bytes);

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e);
            throw new RuntimeException(e);
        }
    }
}

























