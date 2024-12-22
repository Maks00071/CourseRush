package StepikJava.ZaurJava.Course2.Lesson8.Synchronizer.CountDownLatch;

import java.util.concurrent.CountDownLatch;


public class CountDownLatchExp {

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Market staff came to work.");
        countDownLatch.countDown();  // уменьшаем счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Everything is ready, so let's open market.");
        countDownLatch.countDown(); // уменьшаем счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened.");
        countDownLatch.countDown(); // уменьшаем счетчик на 1
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Maks", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Elena", countDownLatch);
        new Friend("Victor", countDownLatch);
        new Friend("Marina", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();

        /*
        Market staff came to work.
        countDownLatch = 2
        Everything is ready, so let's open market.
        countDownLatch = 1
        Market is opened.
        countDownLatch = 0
        Victor приступил(а) к покупкам.
        Maks приступил(а) к покупкам.
        Marina приступил(а) к покупкам.
        Oleg приступил(а) к покупкам.
        Elena приступил(а) к покупкам.
         */
    }
}




































