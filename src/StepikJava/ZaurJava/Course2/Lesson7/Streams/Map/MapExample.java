package StepikJava.ZaurJava.Course2.Lesson7.Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("how are you");
        list1.add("OK");
        list1.add("bye");

        System.out.println(list1); // [hello, how are you, OK, bye]

//        for (int i = 0; i < list1.size(); i++) {
//            list1.set(i, String.valueOf(list1.get(i).length()));
//        }
//
//        System.out.println(list1); // [5, 11, 2, 3]

        // сделаем такое же преобразование через Stream
        List<Integer> list2 = list1.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2); // [5, 11, 2, 3]

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // возводим в степень 2 все четные числа
        array = Arrays.stream(array).map(element -> {
                if (element % 2 == 0) {
                    element *= element;
                }
                return element;
            }).toArray();

        System.out.println(Arrays.toString(array)); // [1, 4, 3, 16, 5, 36, 7, 64, 9, 100]

    }
}
