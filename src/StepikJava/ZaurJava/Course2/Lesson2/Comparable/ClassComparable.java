package StepikJava.ZaurJava.Course2.Lesson2.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ClassComparable {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Maks");
        stringList.add("Ivan");
        stringList.add("Mariya");

        System.out.println("--------------Before sort--------------");
        System.out.println(stringList);
        System.out.println("--------------After sort---------------");
        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
