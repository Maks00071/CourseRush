package StepikJava.ZaurJava.Course2.Lesson8.MethodsOfMultithreading.SleepAndJion;

public class Example2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Example2 thread2 = new Example2();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("End!");
    }
}
