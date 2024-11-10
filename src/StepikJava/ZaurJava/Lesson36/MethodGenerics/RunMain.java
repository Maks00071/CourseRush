package StepikJava.ZaurJava.Lesson36.MethodGenerics;

import java.util.ArrayList;


public class RunMain {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("how");
        stringList.add("are");
        stringList.add("you");

        String secondString = ClassMethodGenerics.getSecondElement(stringList);
        System.out.println(secondString); // "how"

        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            intList.add(i);
        }

        int secondInt = ClassMethodGenerics.getSecondElement(intList);
        System.out.println(secondInt); // 2
    }
}
