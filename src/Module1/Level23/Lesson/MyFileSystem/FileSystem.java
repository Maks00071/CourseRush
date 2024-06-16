package Module1.Level23.Lesson.MyFileSystem;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Реализуем файловую систему, используя классы
 * ByteArrayOutputStream и ByteArrayInputStream.
 *
 * Напишем класс FileSystem с применением паттерна Singleton
 * и будем использовать статическую HashMap<String, byte[]>, где:
 * String — путь к файлу;
 * byte[] — данные в сохраненном файле.
 *
 * Для чтения из файла возвращаем пользователю InputStream.
 * Под капотом — реализация ByteArrayInputStream. Буфером выступает байтовый массив,
 * который хранится в мапе files.
 *
 * Второй интересный метод — newOutputStream. При вызове этого метода мы возвращаем
 * пользователю новый объект типа ByteArrayOutputStream с двумя переопределенными
 * методами: flush и close. Вызов любого из этих методов выступает триггером того,
 * что нужно произвести запись.
 */

public class FileSystem {
    private static final FileSystem fileSystem = new FileSystem();
    private static final Map<String, byte[]> files = new HashMap<>();

    private FileSystem() {
    }

    /**
     * Геттер возвращает объект FileSystem
     * @return объект FileSystem
     */
    public static FileSystem getFileSystem() {
        return fileSystem;
    }

    /**
     * Метод создает новый файл при отсутствии его в системе
     * и кладет его в наш словарь (файловую систему)
     * @param path - путь до файла (ключ)
     */
    public void create(String path) {
        validateNotExists(path);
        files.put(path, new byte[0]);
    }

    /**
     * Метод удаляет файл по ключу (путь до файла)
     * @param path - путь до файла
     */
    public void delete(String path) {
        validateExists(path);
        files.remove(path);
    }

    /**
     * Метод проверяет наличие ключа (путь) в
     * файловой системе (словарь)
     * @param path - ключ (путь до файла)
     * @return - true/false
     */
    public boolean isExists(String path) {
        return files.containsKey(path);
    }

    /**
     * Метод возвращает буфер с массивом байт из файла
     * по ключу
     * @param path - ключ (путь до файла)
     * @return - объект InputStream
     */
    public InputStream newInputStream(String path) {
        validateExists(path);
        return new ByteArrayInputStream(files.get(path));
    }

    /**
     * Метод реализует поток вывода в байтовый массив
     * @param path - ключ (путь до файла)
     * @return
     */
    public OutputStream newOutputStream(String path) {
        validateExists(path);
        return new ByteArrayOutputStream() {
            @Override
            public void flush() throws IOException {
                final byte[] bytes = toByteArray();
                files.put(path, bytes);
                super.flush();
            }

            @Override
            public void close()throws IOException {
                final byte[] bytes = toByteArray();
                files.put(path, bytes);
                super.close();
            }
        };
    }

    /**
     * Метод проверяет, существует ли файл (ключ), если да,
     * то выбрасывает исключение
     * @param path - ключ (путь до файла)
     */
    private void validateExists(String path) {
        if (!files.containsKey(path)) {
            throw new RuntimeException("File not found");
        }
    }

    /**
     * Метод проверяет, существует ли файл (ключ), если нет,
     * то выбрасывает исключение
     * @param path - ключ (путь до файла)
     */
    private void validateNotExists(String path) {
        if (files.containsKey(path)) {
            throw new RuntimeException("File exists");
        }
    }
}






























