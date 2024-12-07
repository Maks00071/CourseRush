package StepikJava.ZaurJava.Course2.Lesson8.Multithreading;

public class MyThread3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("+ " + i);
        }
    }
}
