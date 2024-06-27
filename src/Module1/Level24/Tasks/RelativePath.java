package Module1.Level24.Tasks;

import java.util.Scanner;
import java.nio.file.Path;

/***** Все относительно *****
 * Напиши программу, которая будет считывать с клавиатуры два пути и выводить в консоль относительный
 * путь между первым и вторым путями, если он существует. В противном случае выводить ничего не нужно.
 *
 * Требования:
 * • Программа должна считать из консоли два пути.
 * • Программа должна выводить в консоли относительный путь между введенными путями, если он существует.
 * • Для вычисления относительного пути должен быть использован метод relativize() класса Path.
 * • Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */

public class RelativePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);

        try {
            System.out.println(path1.relativize(path2));
        } catch (Exception ignored) {
        }
    }
}






















