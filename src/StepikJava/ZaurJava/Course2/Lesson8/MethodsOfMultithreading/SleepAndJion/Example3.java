package StepikJava.ZaurJava.Course2.Lesson8.MethodsOfMultithreading.SleepAndJion;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins!");

        Thread thread1 = new Thread(new Worker());
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        thread1.join();
        System.out.println(thread1.getState());

        System.out.println("Method main ends!");
        /*
        Method main begins!
        NEW
        RUNNABLE
        Work begins!
        ----------------------------
        ----------------------------
        Work ends!
        TERMINATED
        Method main ends!
         */
    }
}
