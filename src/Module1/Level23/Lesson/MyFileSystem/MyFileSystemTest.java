package Module1.Level23.Lesson.MyFileSystem;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Тестирование написанной файловой системы FileSystem (FS)
 * При тестировании проверим действия:
 *
 *  1. Создаем новый файл.
 *  2. Проверяем, что созданный файл пустой.
 *  3. Записываем какие-либо данные в файл.
 *  4. Читаем записанные данные, убеждаемся, что они соответствуют записанным.
 *  5. Удаляем файл.
 *  6. Проверяем, что файл удалился.
 *
 * В результате работы этого кода получим вывод:
 *
 *  Файл успешно создан
 *  Содержимое файла:
 *  Данные записаны в файл
 *  Содержимое файла: JavaRush
 *  Файл существует: false
 */

public class MyFileSystemTest {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = FileSystem.getFileSystem();
        final String path = "/user/bin/data.txt";

        // Создаем файл
        fileSystem.create(path);
        System.out.println("Файл успешно создан");

        // Убеждаемся что он пустой
        try (InputStream inputStream = fileSystem.newInputStream(path)) {
            System.out.print("Содержимое файла:\t");
            System.out.println(read(inputStream));
        }

        // Записываем в него данные
        try (final OutputStream outputStream = fileSystem.newOutputStream(path)) {
            outputStream.write("JavaRush".getBytes());
            System.out.println("Данные записаны в файл");
        }

        // Читаем данные
        try (InputStream inputStream = fileSystem.newInputStream(path)) {
            System.out.print("Содержимое файла:\t");
            System.out.println(read(inputStream));
        }

        // Удаляем файл
        fileSystem.delete(path);

        // Проверяем что такого файла в FS не существует
        System.out.print("Файл существует:\t");
        System.out.println(fileSystem.isExists(path));
    }

    private static String read(InputStream inputStream) throws IOException {
        return new String(inputStream.readAllBytes(), UTF_8);
    }
}

































