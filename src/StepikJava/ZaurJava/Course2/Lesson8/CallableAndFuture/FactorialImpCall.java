package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

import java.util.concurrent.Callable;

public class FactorialImpCall implements Callable<Integer> {

    int f;

    public FactorialImpCall(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {

        if (f <= 0) {
            throw new Exception("Вы ввели неверное число!");
        }

        int result = 1;

        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }

        return result;
    }
}
