package StepikJava.ZaurJava.Course2.Lesson4.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(5);
        deque1.addFirst(3);
        deque1.addLast(7);
        deque1.offerFirst(1);
        deque1.offerLast(8);

        System.out.println(deque1); // [1, 3, 5, 7, 8]
    }
}
