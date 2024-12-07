package StepikJava.ZaurJava.Course2.Lesson8.Multithreading;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("- " + i);
        }
    }
}
