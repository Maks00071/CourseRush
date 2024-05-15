package Module1.Level16.Tasks;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

/******Выводим в консоли элементы множества**********
 В классе Solution есть метод print(HashSet<String>), который должен выводить в консоли
 все элементы множества, используя iterator().

 Требования:
 •	В классе Solution должен быть публичный статический метод print(HashSet<String>)
    с типом возвращаемого значения void.
 •	Метод print(HashSet<String>) должен работать согласно условию.
 */

public class SetToConsole {

    public static void print(HashSet<String> words) {
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}

























