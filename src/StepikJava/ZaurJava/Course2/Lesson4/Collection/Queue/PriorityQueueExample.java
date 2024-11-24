package StepikJava.ZaurJava.Course2.Lesson4.Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(4);
        pq1.add(1);
        pq1.add(7);
        pq1.add(10);
        pq1.add(8);

        System.out.println(pq1); // [1, 4, 7, 10, 8]
    }
}
