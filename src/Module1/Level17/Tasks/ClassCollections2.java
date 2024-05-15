package Module1.Level17.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/************Изучаем методы класса Collections, часть 2*************
 В классе Solution объявлены методы:
    reverse(ArrayList<Integer>),
    sort(ArrayList<Integer>),
    rotate(ArrayList<Integer>, int),
    shuffle(ArrayList<Integer>).
 Тебе нужно разобраться, что делают методы, переписать их реализацию,
 используя при этом только соответствующие методы класса Collections.

 Требования:
 •	В классе Solution должен быть публичный статический метод reverse(ArrayList<Integer>)
    с типом возвращаемого значения void.
 •	В классе Solution должен быть публичный статический метод sort(ArrayList<Integer>)
    с типом возвращаемого значения void.
 •	В классе Solution должен быть публичный статический метод rotate(ArrayList<Integer>, int)
    с типом возвращаемого значения void.
 •	В классе Solution должен быть публичный статический метод shuffle(ArrayList<Integer>)
    с типом возвращаемого значения void.
 •	Метод reverse(ArrayList<Integer>) нужно переписать, используя метод reverse класса Collections.
 •	Метод sort(ArrayList<Integer>) нужно переписать, используя метод sort класса Collections.
 •	Метод rotate(ArrayList<Integer>, int) нужно переписать, используя метод rotate класса Collections.
 •	Метод shuffle(ArrayList<Integer>) нужно переписать, используя метод shuffle класса Collections.
 */

public class ClassCollections2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8);
        Collections.addAll(list2, 5, 7, 2, 4, 0, 9, 1);

        System.out.println(list);
        reverse(list);
        System.out.println(list);
        System.out.println("-------------------");
        System.out.println(list2);
        sort(list2);
        System.out.println(list2);
        System.out.println("-------------------");
        System.out.println(list);
        rotate(list, 3);
        System.out.println(list);
        System.out.println("-------------------");
        System.out.println(list);
        shuffle(list);
        System.out.println(list);
    }
    public static void reverse(ArrayList<Integer> list) {
//        for (int i = 0; i < list.size()/2; i++) {
//            Integer tmp = list.get(i);
//            list.set(i, list.get(list.size() - i - 1));
//            list.set(list.size() - i - 1, tmp);
//        }
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size()-1; j++) {
//                if (list.get(j) > list.get(j+1)) {
//                    Integer tmp = list.get(j);
//                    list.set(j, list.get(j+1));
//                    list.set(j+1, tmp);
//                }
//            }
//        }
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int n) {
//        for (int i = 0; i < n; i++) {
//            Integer x = list.get(list.size() - 1);
//            list.remove(list.get(list.size() - 1));
//            list.add(0, x);
//        }
        Collections.rotate(list, n);
    }

    public static void shuffle(ArrayList<Integer> list) {
//        Random rand = new Random();
//        for (int i = 0; i < list.size(); i++) {
//            int randomIndexToSwap = rand.nextInt(list.size());
//            int tmp = list.get(randomIndexToSwap);
//            list.set(randomIndexToSwap, list.get(i));
//            list.set(i, tmp);
//        }
        Collections.shuffle(list);
    }
}





















