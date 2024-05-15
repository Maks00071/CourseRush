package Module1.Level17.Tasks;
import java.util.ArrayList;
import java.util.Collections;

/************Изучаем методы класса Collections, часть 1************
 В классе Solution объявлены методы:
    copy(ArrayList<String>, ArrayList<String>),
    addAll(ArrayList<String>, String...),
    replaceAll(ArrayList<String>, String, String).
 Тебе нужно переписать их реализацию, используя при этом только соответствующие
 методы класса Collections.
 Параметр String... означает то же, что и String[], только аргументы String можно передавать
 через запятую.

 Требования:
 •	В классе Solution должен быть публичный статический
    метод copy(ArrayList<String>, ArrayList<String>) с типом возвращаемого значения void.
 •	В классе Solution должен быть публичный статический
    метод addAll(ArrayList<String>, String...) с типом возвращаемого значения void.
 •	В классе Solution должен быть публичный статический
    метод replaceAll(ArrayList<String>, String, String) с типом возвращаемого значения void.
 •	Метод copy(ArrayList<String>, ArrayList<String>) нужно переписать, используя
    метод copy класса Collections.
 •	Метод addAll(ArrayList<String>, String...) нужно переписать, используя
    метод addAll класса Collections.
 •	Метод replaceAll(ArrayList<String>, String, String) нужно переписать, используя
    метод replaceAll класса Collections
 */

public class ClassCollections1 {
    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if (destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
//        for (int i = 0; i < source.size(); i++) {
//            destination.set(i, source.get(i));
//        }
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
//        for (String string : strings) {
//            list.add(string);
//        }
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
//        for (int i = 0; i < list.size(); i++) {
//            String string = list.get(i);
//            list.set(i, string);
//        }
        Collections.replaceAll(list, oldValue, newValue);
    }
}























