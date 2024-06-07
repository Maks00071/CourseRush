package Module1.Level22.Tasks.UnpackingExceptions;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/******** Распаковка исключений *************
В методе main перехвати RuntimeException. Определи, какое исключение в нем сохранено.
Если это FileNotFoundException, выведи в консоли сообщение: "Не удалось прочесть файл.",
 а если FileSystemException — "Не удалось записать в файл.".

Требования:
•	В методе main должно перехватываться RuntimeException.
•	Нужно вывести "Не удалось прочесть файл.", если в RuntimeException упаковано FileNotFoundException.
•	Нужно вывести "Не удалось записать в файл.", если в RuntimeException упаковано FileSystemException.
•	Класс FileManager не изменяй.
 */

public class FileManager {

    /**
     * Метод имитирует считывание содержимого файла
     * @param filePath - путь к файлу
     * @throws FileNotFoundException
     */
    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаем содержимое файла " + filePath);
    }
}























