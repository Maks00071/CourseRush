package StepikJava.ZaurJava.Course2.Lesson8.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ThreadPoolExp1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService1.execute(new RunnableImpl100());
        }
        executorService1.shutdown();
        executorService1.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main ends!");
    }
}
