package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedMethods;

public class Example5 {
    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        // 3 4 5 3 3 6 8 7 9   -  this is Data Race!  -- так было до synchronized
        // 1 2 3 4 5 6 7 8 9   - так стало после  synchronized
    }
}
