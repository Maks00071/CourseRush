package StepikJava.ZaurJava.Course2.Lesson7.Streams.Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(8);
        list1.add(2);
        list1.add(4);
        list1.add(3);

        int res = list1.stream().reduce((accumulator, element) -> accumulator * element).get();
        // 5, 8, 2, 4, 3
        // accumulator: 5  40  80  320  960
        // element:     8  2   4    3

        System.out.println(res); // 960

        List<Integer> list100 = new ArrayList<>();
//        int res100 = list100.stream().reduce((accu, el) -> accu * el).get();
//        System.out.println(res100);
        // возникнет исключение
        // Exception in thread "main" java.util.NoSuchElementException: No value present
        // правильно так:
        Optional optional = list100.stream().reduce((accu, el) -> accu * el);
        if (optional.isPresent()) {
            int res100 = (int) optional.get();
            System.out.println(res100);
        } else {
            System.out.println("Not present"); // "Not present"
        }

        // reduce with identity
        int res2 = list1.stream().reduce(1, (accu, el) -> accu * el);
        // 5, 8, 2, 4, 3
        // accumulator: 1  5  40  80  320  960
        // element:     5  8  2   4    3

        System.out.println(res2); // 960

        System.out.println("----------------------------");

        List<String> list3 = new ArrayList<>();
        list3.add("One");
        list3.add("Two");
        list3.add("Three");
        list3.add("Four");
        list3.add("Five");

        String concatStr = list3.stream().reduce((accu, el) -> accu + " / " + el).get();
        System.out.println(list3); // [One, Two, Three, Four, Five]
        System.out.println(concatStr); // "One / Two / Three / Four / Five"
    }
}





























