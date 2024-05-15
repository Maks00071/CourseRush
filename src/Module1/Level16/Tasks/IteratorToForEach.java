package Module1.Level16.Tasks;
import java.util.*;

/********
 В классе Solution есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>),
 которые выводят все элементы из переданных коллекций — списка и множества — с новой строки.
 Твоя задача переписать методы на использование цикла for-each.

 Требования:
 •	В классе Solution должен быть публичный статический метод printHashSet(HashSet<String>) с
    типом возвращаемого значения void.
 •	В классе Solution должен быть публичный статический метод printList(ArrayList<String>) с
    типом возвращаемого значения void.
 •	Метод printHashSet(HashSet<String>) должен выводить все элементы с помощью цикла for-each.
 •	Метод printList(ArrayList<String>) должен выводить все элементы с помощью цикла for-each.
 */

public class IteratorToForEach {

    public static void printList(ArrayList<String> words) {
//        for (Iterator<String> iterator = words.iterator(); iterator.hasNext();) {
//            String word = iterator.next();
//            System.out.println(word);
//        }
        //перепишем через for each
        for (String str : words) {
            System.out.println(str);
        }
    }

    public static void printHashSet(HashSet<String> words) {
//        Iterator<String> iterator = words.iterator();
//        while (iterator.hasNext()) {
//            String word = iterator.next();
//            System.out.println(word);
//        }
        //перепишем через for each
        for (String str : words) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}




















