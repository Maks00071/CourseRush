package StepikJava.ZaurJava.Course2.Lesson8.MethodsOfMultithreading.SleepAndJion;

public class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
