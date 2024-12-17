package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

import java.util.concurrent.Callable;

// Класс, реализующий интерфейс Callable
public class CallableClass implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        // наименование потока, выполняющего callable задачу
        return Thread.currentThread().getName();
    }
}
