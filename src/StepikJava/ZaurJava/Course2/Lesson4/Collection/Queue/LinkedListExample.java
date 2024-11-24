package StepikJava.ZaurJava.Course2.Lesson4.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<>();

        queue1.add("Igor");
        queue1.add("Oleg");
        queue1.add("Ivan");
        queue1.add("Maria");
        queue1.add("Alex");

        System.out.println(queue1); // [Igor, Oleg, Ivan, Maria, Alex]

        System.out.println(queue1.element());
        System.out.println(queue1.poll());
        System.out.println(queue1.element());
        System.out.println(queue1.poll());
        System.out.println(queue1.element());
        System.out.println(queue1.poll());
        System.out.println(queue1.element());

    }
}
