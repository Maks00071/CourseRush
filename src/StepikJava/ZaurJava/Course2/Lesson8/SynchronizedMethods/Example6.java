package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedMethods;

public class Example6 {

    static volatile int counter = 0;

    public static synchronized void increment() {  // ставим блокировку на одновременную работу потоков с методом
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl2());
        Thread thread2 = new Thread(new MyRunnableImpl2());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
