package Module1.Level23.Tasks;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/***** Замена потока *****
 * Отрефакторь метод writeData: вместо записи в файл запиши полученные
 * данные в ByteArrayOutputStream и верни полученный поток.
 *
 * Требования:
 * • Метод writeData должен иметь тип возвращаемого значения ByteArrayOutputStream.
 * • Метод writeData должен возвращать поток с теми же данными,
 *   которые до этого записывались в файл.
 */

public class Replacement {
    public static void main(String[] args) throws IOException {
        System.out.println(writeData("Justinian", "Justinian@mega.city.one", 41, 391));
    }

//    public static void writeData(String name, String email, int level, int rating) throws IOException {
//        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\temp.txt")) {
//            fos.write(("Имя: " + name + "\n").getBytes(StandardCharsets.UTF_8));
//            fos.write(("Почта: " + email + "\n").getBytes(StandardCharsets.UTF_8));
//            fos.write(("Уровень: " + level + "\n").getBytes(StandardCharsets.UTF_8));
//            fos.write(("Рейтинг: " + rating + "\n").getBytes(StandardCharsets.UTF_8));
//        }
//
//    }
    public static ByteArrayOutputStream writeData(String name, String email, int level, int rating) throws IOException {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            outputStream.write(("Имя: " + name + "\n").getBytes(StandardCharsets.UTF_8));
            outputStream.write(("Почта: " + email + "\n").getBytes(StandardCharsets.UTF_8));
            outputStream.write(("Уровень: " + level + "\n").getBytes(StandardCharsets.UTF_8));
            outputStream.write(("Рейтинг: " + rating + "\n").getBytes(StandardCharsets.UTF_8));
            return outputStream;
        }
    }
}






















