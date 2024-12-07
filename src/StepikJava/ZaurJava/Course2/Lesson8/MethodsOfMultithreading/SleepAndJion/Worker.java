package StepikJava.ZaurJava.Course2.Lesson8.MethodsOfMultithreading.SleepAndJion;

public class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begins!");

        try {
            System.out.println("----------------------------");
            Thread.sleep(2500);
            System.out.println("----------------------------");
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends!");
    }
}
