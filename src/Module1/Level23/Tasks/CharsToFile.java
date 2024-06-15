package Module1.Level23.Tasks;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * Есть программа, которая считывает из консоли путь к файлу и записывает
 * в этот файл последовательность символов, предварительно преобразовывая символы в байты.
 *
 * Твоя задача — убрать из программы это ненужное преобразование.
 * То есть переписать код таким образом, чтобы в файл записывались сразу символы.
 *
 * Как ты уже знаешь, для записи символов в файл нужно использовать FileWriter.
 *
 * Требования:
 * • Программа должна считать из консоли путь к файлу.
 * • Программа должна переписывать символы в файл.
 * • Для записи символов должен быть использован FileWriter.
 * • Поток для записи должен быть закрыт
 */

public class CharsToFile {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
            FileWriter output = new FileWriter(scanner.nextLine())) {

            char[] chars = new char[]{'j', 'a', 'v', 'a'};
            output.write(chars);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}





















