package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialImpCall factorial = new FactorialImpCall(6);

        Future<Integer> future = executorService.submit(factorial);

        try {
            System.out.println(future.isDone()); // проверяем, завершена ли задача => false
            System.out.println("Хотим получить результат");
            factorialResult = future.get();
            System.out.println("Получили результат");
            System.out.println(future.isDone());  // проверяем, завершена ли задача => true
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

