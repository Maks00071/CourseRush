package StepikJava.ZaurJava.Course2.Lesson4.Collection.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(-3);
        arrayList1.add(8);
        arrayList1.add(12);
        arrayList1.add(-8);
        arrayList1.add(0);
        arrayList1.add(5);
        arrayList1.add(10);
        arrayList1.add(1);
        arrayList1.add(150);
        arrayList1.add(-30);
        arrayList1.add(19);

        System.out.println(arrayList1); // [-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19]
        Collections.sort(arrayList1);
        System.out.println(arrayList1); // [-30, -8, -3, 0, 1, 5, 8, 10, 12, 19, 150]

        int indexElement = Collections.binarySearch(arrayList1, 12);
        System.out.println(indexElement); // 8
    }
}
