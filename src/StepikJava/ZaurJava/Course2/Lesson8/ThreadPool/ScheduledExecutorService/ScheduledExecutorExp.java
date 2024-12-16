package StepikJava.ZaurJava.Course2.Lesson8.ThreadPool.ScheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ScheduledExecutorExp {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200());
//        }
        System.out.println("----------------------- schedule ---------------------------");

//        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();

        System.out.println("------------------ scheduleAtFixedRate ---------------------");

//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
//
//        Thread.sleep(10_000);
//        scheduledExecutorService.shutdown();

        System.out.println("------------------ scheduleWithFixedDelay ---------------------");

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(10_000);
        scheduledExecutorService.shutdown();
    }
}
