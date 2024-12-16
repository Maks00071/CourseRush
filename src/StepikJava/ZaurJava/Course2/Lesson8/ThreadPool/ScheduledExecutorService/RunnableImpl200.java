package StepikJava.ZaurJava.Course2.Lesson8.ThreadPool.ScheduledExecutorService;

public class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
