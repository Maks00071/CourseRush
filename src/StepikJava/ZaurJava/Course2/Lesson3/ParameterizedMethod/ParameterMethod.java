package StepikJava.ZaurJava.Course2.Lesson3.ParameterizedMethod;

import java.util.ArrayList;


public class ParameterMethod {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        intList.add(5);
        intList.add(10);
        intList.add(-6);

        stringList.add("Hello");
        stringList.add("bye");
        stringList.add("OK");

        int x = ClassGetElement.getSecondElement(intList);
        System.out.println(x); // 10

        System.out.println("------------------------------");

        String s = ClassGetElement.getSecondElement(stringList);
        System.out.println(s); // "bye"

    }
}


























