package StepikJava.ZaurJava.Course2.Lesson8.DaemonThreads;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts!");

        UserThread userThread = new UserThread();
        userThread.setName("user_thread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ends!");
    }
}
