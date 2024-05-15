package Module1.Level16.Tasks;

import java.util.HashSet;
import java.util.ArrayList;
import static java.util.Arrays.asList;

/*****************Преобразование списка во множество***************
 В этой задаче нужно получить количество уникальных слов в списке.
 Одним из способов решения является преобразования списка во множество. Как известно,
 во множестве все элементы уникальные и размер полученного множества как раз и будет
 количеством уникальных слов.

 Реализуй метод listToSet(ArrayList<String>), который преобразует список строк во множество.

 Требования:
 •	Сигнатуру и тип возвращаемого значения метода listToSet(ArrayList<String>) не изменяй.
 •	Метод listToSet должен преобразовывать полученный список строк (ArrayList<String>)
 во множество (HashSet<String>).
 */

public class ListToSet {

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList(asList(
                ("В свет вышла новая серия книг по программированию на Java: " +
                        "\"Java для начинающих\", \"Java для продолжающих\", " +
                        "\"Java для заканчивающих\"").split(" ")));

        System.out.println("Количество слов в списке: " + listOfWords.size());
        HashSet<String> setOfWords = listToSet(listOfWords);
        System.out.println("Количество слов во множестве: " + setOfWords.size());
    }

    public static HashSet<String> listToSet(ArrayList<String> listOfWords) {
        return new HashSet<>(listOfWords);
    }
}























