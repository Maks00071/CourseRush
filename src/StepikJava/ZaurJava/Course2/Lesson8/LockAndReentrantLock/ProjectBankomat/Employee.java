package StepikJava.ZaurJava.Course2.Lesson8.LockAndReentrantLock.ProjectBankomat;

import java.util.concurrent.locks.Lock;


public class Employee extends Thread {
    // каждый клиент будет иметь
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start(); // сразу запускаем поток при создании
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//                System.out.println(name + " ждет ... ");
//                lock.lock();  // накладываем блокировку
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000); // пользуемся банкоматом 2 сек
                System.out.println(name + " окончил(а) пользоваться банкоматом");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет стоять в очереди!");
        }
    }
}
