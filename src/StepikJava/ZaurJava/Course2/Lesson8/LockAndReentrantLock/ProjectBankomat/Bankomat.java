package StepikJava.ZaurJava.Course2.Lesson8.LockAndReentrantLock.ProjectBankomat;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Employee("Maks", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Victor", lock);
        new Employee("Marina", lock);

        /*
        Maks пользуется банкоматом
        Oleg не хочет стоять в очереди!
        Elena не хочет стоять в очереди!
        Maks окончил(а) пользоваться банкоматом
        Victor пользуется банкоматом
        Marina не хочет стоять в очереди!
        Victor окончил(а) пользоваться банкоматом
         */
    }
}
