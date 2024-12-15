package StepikJava.ZaurJava.Course2.Lesson8.DaemonThreads;

public class DaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());

        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
