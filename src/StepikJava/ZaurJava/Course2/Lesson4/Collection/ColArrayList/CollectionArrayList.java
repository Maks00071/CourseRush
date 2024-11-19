package StepikJava.ZaurJava.Course2.Lesson4.Collection.ColArrayList;

import java.util.ArrayList;
import java.util.List;


public class CollectionArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("you");
        list1.add("we");
        list1.add("they");
        list1.add(1, "I");
        System.out.println(list1); // "[you, I, we, they]"

        System.out.println("---------------------------");
        System.out.println(list1.get(3)); // "they"
        System.out.println("---------------------------");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("---------------------------");

        System.out.println(list1); // "[you, I, we, they]"
        list1.set(2, "Hello");
        System.out.println(list1); // "[you, I, Hello, they]"

        System.out.println("---------------------------");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");

        System.out.println(list1); // "[you, I, Hello, they]"
        list1.addAll(list2);
        System.out.println(list1); // "[you, I, Hello, they, !!!, ???]"
    }
}






























