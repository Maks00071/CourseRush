package StepikJava.ZaurJava.Course2.Lesson4.Collection.StackCol;

import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();

        stack1.push("Igor");
        stack1.push("Misha");
        stack1.push("Nina");
        stack1.push("Ivan");
        System.out.println(stack1); // "[Igor, Misha, Nina, Ivan]"

        System.out.println("------------------------------------");

        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
            System.out.println(stack1);
        }

        /*
        Ivan
        [Igor, Misha, Nina]
        Nina
        [Igor, Misha]
        Misha
        [Igor]
        Igor
        []
         */

        System.out.println("------------------------------------");

        stack1.push("Igor");
        stack1.push("Misha");
        stack1.push("Nina");
        stack1.push("Ivan");
        System.out.println(stack1); // "[Igor, Misha, Nina, Ivan]"

        System.out.println("------------------------------------");

        System.out.println(stack1.peek()); // "Ivan"
        System.out.println(stack1); // "[Igor, Misha, Nina, Ivan]"

    }
}













