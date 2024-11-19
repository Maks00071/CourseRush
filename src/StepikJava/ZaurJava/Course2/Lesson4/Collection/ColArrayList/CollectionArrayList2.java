package StepikJava.ZaurJava.Course2.Lesson4.Collection.ColArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class CollectionArrayList2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] sbArray = {sb1, sb2, sb3, sb4};
        List<StringBuilder> sbList = Arrays.asList(sbArray);
        System.out.println(sbList); // "[A, B, C, D]"

        System.out.println("----------------------------------");

        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("Ivan");
        aL1.add("Mariya");
        aL1.add("Petr");
        aL1.add("Boris");
        System.out.println(aL1); // "[Ivan, Mariya, Petr, Boris]"

        System.out.println("----------------------------------");

        ArrayList<String> aL2 = new ArrayList<>();
        aL2.add("Ivan");
        aL2.add("Mariya");
        aL2.add("Igor");

//        aL1.removeAll(aL2);
//        System.out.println(aL1); // "[Petr, Boris]"

        aL1.retainAll(aL2);
        System.out.println(aL1); // "[Ivan, Mariya]"

        System.out.println("----------------------------------");

        boolean a = aL1.containsAll(aL2);
        System.out.println(a);

        System.out.println("----------------------------------");

        List<Integer> intList = List.of(1, 45, 9, 21);
        System.out.println(intList); // [1, 45, 9, 21]

    }
}























