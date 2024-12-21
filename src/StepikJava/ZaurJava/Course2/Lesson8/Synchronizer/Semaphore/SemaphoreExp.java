package StepikJava.ZaurJava.Course2.Lesson8.Synchronizer.Semaphore;

import java.util.concurrent.Semaphore;


public class SemaphoreExp {
    public static void main(String[] args) {
        // делаем телефонную будку (одномоменто могут звонить только два человека)
        Semaphore callBox = new Semaphore(2);

        new Person("Maks", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Victor", callBox);
        new Person("Marina", callBox);


    }
}
