package StepikJava.ZaurJava.Course2.Lesson7.Streams.ForEach;

import java.util.ArrayList;
import java.util.Arrays;


public class ForEachExample {
    public static void main(String[] args) {
        int[] arrayInt = {1, 3, 5, 7, 9};
        Arrays.stream(arrayInt).forEach(el -> {
            System.out.println(el + " = " + el);
            el *= 2;
            System.out.println(el + " * 2 = "  + el);
        });

        // просто выведем элементы
        Arrays.stream(arrayInt).forEach(System.out::println);
        /*
        1
        3
        5
        7
        9
         */


    }
}
