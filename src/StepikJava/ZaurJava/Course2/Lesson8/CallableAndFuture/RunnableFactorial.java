package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class RunnableFactorial {

    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);

        executorService.execute(factorial);
        executorService.shutdown();

        // ждем либо 10 сек, либо окончания работы всех потоков пула
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println(factorialResult); // 120
    }

}
