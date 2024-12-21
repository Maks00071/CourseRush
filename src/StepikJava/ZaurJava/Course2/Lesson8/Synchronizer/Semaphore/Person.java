package StepikJava.ZaurJava.Course2.Lesson8.Synchronizer.Semaphore;

import java.util.concurrent.Semaphore;

public class Person extends Thread {


    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет...");
            callBox.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(2000); // идет звонок
            System.out.println(name + " завершил(а) звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release(); // освобождаем ресурс (счетчик + 1)
        }
    }
}
