package StepikJava.ZaurJava.Course2.Lesson8.LockSituations.Deadlock;

public class Thread10v2 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread10v1: Попытка захватить монитор объекта lock2");
        synchronized (DeadlockExp.lock2) {
            System.out.println("Thread10v1: Монитор объекта lock2 захвачен");
            System.out.println("Thread10v1: Попытка захватить монитор объекта lock1");
            synchronized (DeadlockExp.lock1) {
                System.out.println("Thread10v1: Мониторы объектов lock2 и lock1 захвачены");
            }
        }
    }
}
