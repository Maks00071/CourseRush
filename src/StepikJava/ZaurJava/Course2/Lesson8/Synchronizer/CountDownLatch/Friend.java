package StepikJava.ZaurJava.Course2.Lesson8.Synchronizer.CountDownLatch;

import java.util.concurrent.CountDownLatch;


public class Friend extends Thread {

    private String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            // если счетчик объекта CountDownLatch > 0,
            // то поток будет залочен, пока счетчик не будет == 0
            countDownLatch.await();
            // поток вышел из блокировки
            System.out.println(name + " приступил(а) к покупкам.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
