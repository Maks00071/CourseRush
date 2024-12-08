package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedBlocks;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnable1 runnable = new MyRunnable1();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
