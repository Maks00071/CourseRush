package StepikJava.ZaurJava.Course1.Lesson19.Homework;

import java.util.Arrays;

public class ClassSort {
    public static void main(String[] args) {
        int[] array1 = new int[]{5, 7, 0, 1, 9, 3, -5};
        System.out.println(Arrays.toString(sortArray(array1)));
    }

    /**
     * Метод принимает целочисленный массив, сортирует
     * по возрастанию и возвращает его
     *
     * @param array - неотсортированный массив
     * @return - отсортированный по возрастанию массив
     */
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
