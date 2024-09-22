package StepikJava.ZaurJava.Lesson21.Homework;

import java.util.ArrayList;
import java.util.Collections;

public class HWArrayList {
    public static void main(String[] args) {
        abc("E", "B", "D", "C", "A", "A", "D");
    }

    public static ArrayList abc(String...strInput) {
        ArrayList<String> arrayStr = new ArrayList<>();

        for (String str: strInput) {
            if (!arrayStr.contains(str)) {
                arrayStr.add(str);
            }
        }
        Collections.sort(arrayStr);
        System.out.println(arrayStr);  // [A, B, C, D, E]
        return arrayStr;
    }
}
