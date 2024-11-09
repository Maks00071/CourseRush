package StepikJava.ZaurJava.Lesson34.InterfacePredicate;

import java.util.function.*;


public class ClassPredicate {
    public static void main(String[] args) {

        // creating predicate
        Predicate<String> checkStringLenght = str -> str.length() < 10;

        // calling predicate method
        System.out.println(checkStringLenght.test("Hello!"));  // true
    }
}
