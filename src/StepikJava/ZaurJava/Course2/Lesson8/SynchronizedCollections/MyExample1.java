package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedCollections;

import java.util.*;


public class MyExample1 {
    public static void main(String[] args) {
        List list;

        list = Collections.synchronizedList(new ArrayList<String>());
        for (int i = 0; i < 10; i++) {
            list.add("i = " + i);
        }

        System.out.println(list); // [i = 0, i = 1, i = 2, i = 3, i = 4, i = 5, i = 6, i = 7, i = 8, i = 9]

        try {
            for (Iterator i = list.iterator(); i.hasNext(); ) {
                System.out.println(i.next().toString());
                // list.remove(3); - вызовет Exception!
            }
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
    }
}
