package StepikJava.ZaurJava.Course2.Lesson7.Streams.Count;

import java.util.stream.Stream;

public class CountExample {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 1, 2, 3, 4);

//        System.out.println(stream1.count()); // 10
        System.out.println(stream1.distinct().count()); // 6
    }
}
