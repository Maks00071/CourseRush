package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableExample {

    public CallableExample() {
        // Определяем пул из трех потоков
        ExecutorService executorService;
        executorService = Executors.newFixedThreadPool(3);

        // Список ассоциированных с Callable задач Future
        List<Future<String>> futureList;
        futureList = new ArrayList<Future<String>>();

        // Создание экземпляра Callable класса
        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 3; i++) {
            /*
             * Стартуем возвращаюший результат исполнения
             * в виде объекта Future поток
             */
            Future<String> future;

        }
    }
}



























































