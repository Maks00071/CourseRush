package Module1.Level18.Tasks;

import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Queue<String> queue = new MyQueue();

        for (int i = 0; i < 10; i++) {
            queue.offer("элемент " + i);
        }
        System.out.println("длина очереди: " + queue.size());

        System.out.println("*** iterator ***");
        queue.iterator();

        System.out.println("*** peek ***");
        for (int i = 0; i < 12; i++) {
            System.out.println(queue.peek());
        }

        System.out.println("*** poll ***");
        for (int i = 0; i < 12; i++) {
            System.out.println(queue.poll());
        }

        System.out.println("длина очереди: " + queue.size());
    }
}















