package StepikJava.ZaurJava.Course2.Lesson8.Multithreading;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());

        thread1.start();
        thread2.start();
    }
}
