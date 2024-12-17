package StepikJava.ZaurJava.Course2.Lesson8.CallableAndFuture;

public class Factorial implements Runnable {

    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Вы ввели неверное число!");
            return;
        }

        int result = 1;

        for (int i = 1; i <= f; i++) {
            result *= i;
        }

        RunnableFactorial.factorialResult = result;
    }
}
