package StepikJava.ZaurJava.Course2.Lesson8.Multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();
    }
}
