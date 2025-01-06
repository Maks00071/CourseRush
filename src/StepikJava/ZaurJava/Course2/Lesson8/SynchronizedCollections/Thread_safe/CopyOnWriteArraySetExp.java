package StepikJava.ZaurJava.Course2.Lesson8.SynchronizedCollections.Thread_safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;


public class CopyOnWriteArraySetExp {

    List<User> list;
    CopyOnWriteArraySet<User> cowSet;

    public CopyOnWriteArraySetExp() {
        list = new ArrayList<User>();
        list.add(new User("Прохор"));
        list.add(new User("Георгий"));
        list.add(new User("Михаил"));

        cowSet = new CopyOnWriteArraySet<>(list);

        System.out.println("Цикл с измением");

        Iterator<User> iterator = cowSet.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(" " + user.name);

            if (++count == 2) {
                cowSet.add(new User("Павел"));
                user.name += " Иванович";
            }
        }

        System.out.println("\nЦикл без измения");

        iterator = cowSet.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(" " + user.name);
        }
    }

    class User {
        private String name;

        public User(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        new CopyOnWriteArraySetExp();

        /*
        Цикл с измением
         Прохор
         Георгий
         Михаил

        Цикл без измения
         Прохор
         Георгий Иванович
         Михаил
         Павел
         */
    }
}


































