package StepikJava.ZaurJava.Course2.Lesson7.Streams.Iterate;

import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
        Stream.iterate(2, x -> x + 6).limit(6).forEach(System.out::println);
        /*
        2
        8
        14
        20
        26
        32
         */
    }
}
