package StepikJava.ZaurJava.Course2.Lesson7.Streams.MethodChaining;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MethodChainingExample {
    public static void main(String[] args) {
        int[] arrayInt = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        int result1 = Arrays.stream(arrayInt).filter(el -> el % 2 != 0).
                map(el -> {if (el % 3 == 0) {return el / 3;} return el;})
                .reduce((accu, el) -> accu + el).getAsInt();

        System.out.println(result1); // 51

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.filter(el -> {
            System.out.println("el = " + el);
            return el % 2==0;
        }).collect(Collectors.toList());
    }
}
