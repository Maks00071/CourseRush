package StepikJava.ZaurJava.Course2.Lesson7.ParallelStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;


public class ParallelStream {
    public static void main(String[] args) {

//        long startTime = System.currentTimeMillis();

//        double result1 = DoubleStream.iterate(1, i -> i + 1).limit(1_000_000_000).sum();
//        System.out.println("result1 = " + result1); // "result1 = 5.000000005E17"

        List<Integer> listLong = new ArrayList<>(1_000_000_001);
        for (int i = 1; i < 1_000_000_001; i++) {
            listLong.add(i);
        }
        System.out.println(listLong.size());

        long startTime = System.currentTimeMillis();

        double result2 = listLong.parallelStream().reduce((accu, el) -> accu + el).get();
        System.out.println("result2 = " + result2);

        long finishTime = System.currentTimeMillis();
        long elapsed = finishTime - startTime;

        System.out.println("Время выполнения, мс: " + elapsed); // "Время выполнения, мс: 4617"

    }
}
