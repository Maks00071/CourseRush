package StepikJava.ZaurJava.Course2.Lesson7.Streams.Sorted;

import java.util.Arrays;

public class SortedExample {
    public static void main(String[] args) {
        int[] arrayInt = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int[] arraySorted = Arrays.stream(arrayInt).sorted().toArray();

        System.out.println(Arrays.toString(arrayInt)); // [3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18]
        System.out.println(Arrays.toString(arraySorted)); // [1, 3, 4, 5, 7, 8, 9, 12, 18, 21, 81]
    }
}
