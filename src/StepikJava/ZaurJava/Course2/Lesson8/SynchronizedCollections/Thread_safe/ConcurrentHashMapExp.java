package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedCollections.Thread_safe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapExp {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Maks");
        map.put(2, "Oleg");
        map.put(3, "Sergey");
        map.put(4, "Ivan");
        map.put(5, "Igor");
        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(map);


        /*
        {1=Maks, 2=Oleg, 3=Sergey, 4=Ivan, 5=Igor}
        1:Maks
        2:Oleg
        3:Sergey
        4:Ivan
        5:Igor
        6:Elena
        {1=Maks, 2=Oleg, 3=Sergey, 4=Ivan, 5=Igor, 6=Elena}
         */
    }
}
































