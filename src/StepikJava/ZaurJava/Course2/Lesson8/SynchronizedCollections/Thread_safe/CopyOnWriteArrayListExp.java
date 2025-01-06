package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedCollections.Thread_safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListExp {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Maks");
        list.add("Oleg");
        list.add("Sergey");
        list.add("Ivan");
        list.add("Igor");

        System.out.println(list);

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();

            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);
            list.add("Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(list);

        /*
        [Maks, Oleg, Sergey, Ivan, Igor]
        Maks
        Oleg
        Sergey
        Ivan
        Igor
        [Maks, Oleg, Sergey, Ivan, Elena]
         */
    }
}


















































