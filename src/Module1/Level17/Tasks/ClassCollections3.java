package Module1.Level17.Tasks;
import java.util.Collections;
import java.util.ArrayList;

/**********Изучаем методы класса Collections, часть 3**************
 В классе Solution объявлены методы:
    min(ArrayList<Integer>),
    max(ArrayList<Integer>),
    frequency(ArrayList<Integer>, Integer),
    binarySearch(ArrayList<Integer>, Integer).
 Тебе нужно разобраться, что делают методы, переписать их реализацию,
 используя при этом только соответствующие методы класса Collections.

 Требования:
 •	В классе Solution должен быть публичный статический метод min(ArrayList<Integer>) с
    типом возвращаемого значения Integer.
 •	В классе Solution должен быть публичный статический метод max(ArrayList<Integer>) с
    типом возвращаемого значения Integer.
 •	В классе Solution должен быть публичный статический метод frequency(ArrayList<Integer>, Integer) с
    типом возвращаемого значения int.
 •	В классе Solution должен быть публичный статический метод binarySearch(ArrayList<Integer>, Integer)
    с типом возвращаемого значения int.
 •	Метод min(ArrayList<Integer>) нужно переписать, используя метод min класса Collections.
 •	Метод max(ArrayList<Integer>) нужно переписать, используя метод max класса Collections.
 •	Метод frequency(ArrayList<Integer>, Integer) нужно переписать, используя метод frequency
    класса Collections.
 •	Метод binarySearch(ArrayList<Integer>, Integer) нужно переписать, используя метод binarySearch
    класса Collections.
 */

public class ClassCollections3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(min(list));
        System.out.println(max(list));
        System.out.println(frequency(list, 5));
        System.out.println(binarySearch(list, 5));
    }

    public static Integer min(ArrayList<Integer> list) {
//        int minValue = Integer.MAX_VALUE;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < minValue) {
//                minValue = list.get(i);
//            }
//        }
//        return minValue;
        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
//        int maxValue = Integer.MIN_VALUE;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) > maxValue) {
//                maxValue = list.get(i);
//            }
//        }
//        return maxValue;
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
//        int frequency = 0;
//        if (element == null) {
//            return frequency;
//        }
//        for (Integer elem : list) {
//            if (elem.equals(element)) {
//                frequency += 1;
//            }
//        }
//        return frequency;
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        Collections.sort(list);
//        int low = 0;
//        int high = list.size() - 1;
//        int resultIndex = -1;
//
//        while (low <= high) {
//            int middle = (low + high) / 2;
//            if (list.get(middle).equals(key)) {
//                resultIndex = middle;
//                break;
//            } else if (list.get(middle) > key) {
//                high = middle - 1;
//            } else {
//                low = middle + 1;
//            }
//        }
//        return resultIndex;
        return Collections.binarySearch(list, key);
    }
}















