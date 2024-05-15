package Module1.Level18;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.ArrayDeque;

public class ClassPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));

        priorityQueue.add("Andrew");
        priorityQueue.add("John");
        priorityQueue.add("Rob");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
        System.out.println("--------------------------");
        Deque<String> deque1 = new ArrayDeque<>();

        deque1.add("Apple");
        deque1.addFirst("Orange");
        deque1.add("Lemon");
        deque1.addLast("Pineapple");

        System.out.println(deque1);
        System.out.println("--------------------------");

        System.out.printf("The first element from deque is %s%n", deque1.getFirst());
        System.out.printf("The last element from deque is %s%n", deque1.getLast());


    }
}





















