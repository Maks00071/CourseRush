package StepikJava.ZaurJava.Course2.Lesson7.Streams.Distinct;

import java.util.stream.Stream;

public class DistinctExample {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 1, 2, 5, 6, 3);
        stream1.distinct().forEach(System.out::println);
        /*
        1
        2
        3
        4
        5
        6
         */
    }
}
