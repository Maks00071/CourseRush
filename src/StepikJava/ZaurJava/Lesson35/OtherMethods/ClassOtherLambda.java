package StepikJava.ZaurJava.Lesson35.OtherMethods;

import java.util.ArrayList;
import java.util.List;


public class ClassOtherLambda {
    public static void main(String[] args) {
        List<String> someList = List.of("Hello", "Bye", "Chao", "One", "Two");

        someList.forEach(s -> System.out.println(s));

        ArrayList<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listInt.add(i);
        }

        listInt.removeIf(element -> element % 3 == 0);
        System.out.println(listInt); // [1, 2, 4]

        ArrayList<Integer> listInt2 = new ArrayList<>();
        listInt2.add(5);
        listInt2.add(15);
        listInt2.add(0);
        listInt2.add(51);
        listInt2.add(-5);
        listInt2.add(2);
        System.out.println(listInt2); // [5, 15, 0, 51, -5, 2]
        listInt2.sort((x, y) -> x.compareTo(y));
        System.out.println(listInt2); // [-5, 0, 2, 5, 15, 51]

        // сортировка в обратном порядке
        listInt2.sort((x, y) -> -x.compareTo(y));
        System.out.println(listInt2); // [51, 15, 5, 2, 0, -5]

    }
}


















