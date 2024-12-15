package StepikJava.ZaurJava.Course2.Lesson8.DaemonThreads;

public class UserThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());

        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
