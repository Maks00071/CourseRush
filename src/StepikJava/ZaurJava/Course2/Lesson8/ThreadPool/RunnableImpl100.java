package StepikJava.ZaurJava.Course2.Lesson8.ThreadPool;

public class RunnableImpl100 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
