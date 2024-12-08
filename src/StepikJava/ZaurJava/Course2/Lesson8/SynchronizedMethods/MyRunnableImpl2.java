package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedMethods;

public class MyRunnableImpl2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Example6.increment();
        }
    }
}
