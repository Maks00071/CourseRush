package StepikJava.ZaurJava.Course2.Lesson8.Interruption;

public class InterruptionExp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts!");

        InterruptedThread thread1 = new InterruptedThread();
        thread1.start();
        Thread.sleep(2000);
        thread1.interrupt();

        thread1.join();

        System.out.println("Main ends!");
    }
}
