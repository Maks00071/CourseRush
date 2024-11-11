package StepikJava.ZaurJava.Course1.Lesson19;

import java.util.Arrays;

public class ClassArrays {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.println("---------------------------------");

        // Arrays.sort(array)
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");  // -8 0 1 1 3 4 5 9
        }

        System.out.println();

        System.out.println("---------------------------------");

        //Arrays.binarySearch(array, value)
        int index1 = Arrays.binarySearch(array1, 3);
        System.out.println(index1); // 4

    }
}
















