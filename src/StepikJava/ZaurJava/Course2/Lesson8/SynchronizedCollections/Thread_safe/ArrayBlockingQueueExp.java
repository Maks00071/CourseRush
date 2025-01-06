package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedCollections.Thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExp {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        // producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer added: " + i + " " + arrayBlockingQueue);
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer element = arrayBlockingQueue.take();
                    System.out.println("Consumer took: " + element + " " + arrayBlockingQueue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
