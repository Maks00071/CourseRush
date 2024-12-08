package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedBlocks;

public class MyRunnable1 implements Runnable {

    private void doWork1() {
        System.out.println("I stay before synchronized-block!");
    }

    private synchronized void doWork2() {
        Counter2.count++;
        System.out.println(Counter2.count);
    }

    private void doWork3() {
        doWork1();  // этот метод используется всеми потоками сразу!
        synchronized(this) {  // этот блок только поочередно!
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork3();
        }
    }
}
