package StepikJava.ZaurJava.Course2.Lesson8.Multithreading;

public class MyThread4 implements Runnable {

    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("- " + i);
        }
    }
}
