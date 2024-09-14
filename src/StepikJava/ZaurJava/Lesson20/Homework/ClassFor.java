package StepikJava.ZaurJava.Lesson20.Homework;

import java.util.Arrays;

public class ClassFor {
    public static void main(String[] args) {
        abc(new String[]{"a", "b", "c"}, new String[]{"d", "e", "f"});
    }

    public static void abc(String[]...StringArray) {
        String[][] result = new String[StringArray.length][];
        int i = 0;

        for(String[] array: StringArray) {
            result[i] = array;
            i++;
        }

        for(String[] array: result) {
            System.out.println(Arrays.toString(array));
        }
    }
}
