package Module1.Level18;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ClassPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));

        priorityQueue.add("Andrew");
        priorityQueue.add("John");
        priorityQueue.add("Rob");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
