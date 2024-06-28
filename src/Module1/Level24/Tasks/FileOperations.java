package Module1.Level24.Tasks;

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

/***** Файловые операции *****
 * Нужно написать программу, которая будет считывать с клавиатуры два пути к файлу.
 * -----
 * Если файла по первому пути не существует, его нужно создать.
 * Если же файл по первому пути существует, нужно переместить этот файл по второму пути,
 * но только в том случае, если по второму пути файла нет.
 * Если же он есть, нужно просто удалить файл по первому пути.
 * Используй соответствующие методы класса Files: createFile(), move(), delete(), exists()/notExists().
 * -----
 * Требования:
 * •	Программа должна считать из консоли два пути.
 * •	В программе должны быть использованы соответствующие методы класса Files:
 *      createFile(Path.class), move(Path, Path), delete(Path), exists(Path)/notExists(Path).
 * •	Программа должна обрабатывать введенные пути согласно условию.
 * •	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader,
 *      FileWriter пакета java.io.
 */

public class FileOperations {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());

        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        } else if (Files.notExists(fileNewPath)) {
            Files.move(filePath, fileNewPath);
        } else {
            Files.delete(filePath);
        }
    }
}


















