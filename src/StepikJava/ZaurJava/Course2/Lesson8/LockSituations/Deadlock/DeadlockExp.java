package StepikJava.ZaurJava.Course2.Lesson8.LockSituations.Deadlock;

public class DeadlockExp {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10v1 thread10v1 = new Thread10v1();
        Thread10v2 thread10v2 = new Thread10v2();

        thread10v1.start();
        thread10v2.start();
    }
}
