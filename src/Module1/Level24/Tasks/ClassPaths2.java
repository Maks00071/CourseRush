package Module1.Level24.Tasks;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Реализуй метод joinToPath, который должен объединить все части пути из списка partsList в один путь и вернуть его.
 * Для создания полного пути используй метод Paths.get(String first, String... more).
 * Не передавай в Paths.get пустые строки.
 * ---
 * Требования:
 * • Метод joinToPath должен вернуть путь состоящий из частей из списка partsList.
 * • Метод joinToPath должен использовать метод Paths.get(String first, String... more)
 *   передав в него все элементы списка.
 */

public class ClassPaths2 {

    public static void main(String[] args) {
        System.out.println(joinToPath(Arrays.asList("d:/", "study/", "javarush/", "полезные куски кода.txt")));
    }

    /**
     * Метод объединяет все части массива в один путь до файла/директории
     * @param partsList - массив для объединения
     * @return - объект Path
     */
    public static Path joinToPath(List<String> partsList) {
        //массив для заполнения всех элементов, кроме первого
        String[] partsArray = new String[partsList.size() - 1];

        //Для копирования массива будем использовать метод .arraycopy системного класса System
        System.arraycopy(partsList.toArray(), 1, partsArray, 0, partsArray.length);

        Path path = Paths.get(partsList.getFirst(), partsArray);
        return path;
    }
}


























