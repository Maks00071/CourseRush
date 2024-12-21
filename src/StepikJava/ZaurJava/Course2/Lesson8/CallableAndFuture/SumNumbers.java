package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;


public class SumNumbers {

    private static long value = 1_000_000_000L;
    private static long sumNum = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // определяем фиксированное кол-во потокв в pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // создаем список объектов Future<Long>
        List<Future<Long>> futureResults = new ArrayList<>();

        long valueDivideBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDivideBy10 * i + 1;
            long to = valueDivideBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            // добавляем результат вычисления (объект Future<Long>) в список
            futureResults.add(futurePartSum);
        }
        // сложим результаты вычислений1 потоков в единую сумму
        for (Future<Long> result : futureResults) {
            sumNum += result.get();
        }
        executorService.shutdown();
        System.out.println(sumNum);

        /*
        Sum from 700000001 to 800000000 is 75000000050000000
        Sum from 900000001 to 1000000000 is 95000000050000000
        Sum from 1 to 100000000 is 5000000050000000
        Sum from 400000001 to 500000000 is 45000000050000000
        Sum from 500000001 to 600000000 is 55000000050000000
        Sum from 200000001 to 300000000 is 25000000050000000
        Sum from 600000001 to 700000000 is 65000000050000000
        Sum from 100000001 to 200000000 is 15000000050000000
        Sum from 300000001 to 400000000 is 35000000050000000
        Sum from 800000001 to 900000000 is 85000000050000000
        500000000500000000
         */
    }

}
