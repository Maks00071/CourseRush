package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialImpCall factorial = new FactorialImpCall(10);

        Future<Integer> future = executorService.submit(factorial);

        try {
            factorialResult = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.getCause();
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

