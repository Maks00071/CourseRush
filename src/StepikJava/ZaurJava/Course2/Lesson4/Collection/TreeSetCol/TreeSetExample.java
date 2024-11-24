package StepikJava.ZaurJava.Course2.Lesson4.Collection.TreeSetCol;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(5);
        treeSet1.add(8);
        treeSet1.add(2);
        treeSet1.add(1);
        treeSet1.add(10);

        System.out.println(treeSet1); // [1, 2, 5, 8, 10]
    }
}
