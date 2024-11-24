package StepikJava.ZaurJava.Course2.Lesson4.Collection.SetCol;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("Petr"); // под капотом метод .put()
        set1.add("Oleg");
        set1.add("Marina");
        set1.add("Igor");
        set1.add(null);

        System.out.println(set1); // [null, Igor, Petr, Oleg, Marina]

        for (String s : set1) {
            System.out.println(s);
        }
    }
}
