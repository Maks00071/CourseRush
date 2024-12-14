package StepikJava.ZaurJava.Course2.Lesson8.LockSituations.Deadlock;

public class Thread10v1 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread10v1: Попытка захватить монитор объекта lock1");
        synchronized (DeadlockExp.lock1) {
            System.out.println("Thread10v1: Монитор объекта lock1 захвачен");
            System.out.println("Thread10v1: Попытка захватить монитор объекта lock2");
            synchronized (DeadlockExp.lock2) {
                System.out.println("Thread10v1: Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}
