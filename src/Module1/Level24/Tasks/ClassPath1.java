package Module1.Level24.Tasks;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/***** Использование Paths *****
 * В методе main инициализируй поле rpmLogPath абсолютным именем файла rpm.log, который находится в папке /usr/lib/rpm.
 * Для создания объекта Path используй метод get с одним параметром типа URI класса Paths.
 * Требования:
 * • Метод main должен инициализировать поле rpmLogPath абсолютным путем к файлу rpm.log в папке /usr/lib/rpm.
 * • Метод main должен использовать метод Paths.get() с одним параметром типа URI для создания объекта Path.
 */

public class ClassPath1 {
    public static Path rpmLogPath;

    public static void main(String[] args) throws Exception {
        rpmLogPath = Paths.get(new URI("file:/usr/lib/rpm/rpm.log"));
    }
}
