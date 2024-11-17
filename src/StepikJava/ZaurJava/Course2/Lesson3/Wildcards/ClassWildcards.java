package StepikJava.ZaurJava.Course2.Lesson3.Wildcards;

import java.util.ArrayList;
import java.util.List;


public class ClassWildcards {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();

        list1.add(5);
        list1.add(90);
        list1.add(1);
        showMyList(list1); // "My list: [5, 90, 1]"

        System.out.println("----------------------------------");

        list2.add("ok");
        list2.add("you");
        list2.add("Hello");
        showMyList(list2); // "My list: [ok, you, Hello]"

        System.out.println("----------------------------------");

        list3.add(3.14);
        list3.add(5.1);
        list3.add(23.54);
        showMyList(list3); // "My list: [3.14, 5.1, 23.54]"

        System.out.println("----------------------------------");

        ArrayList<Double> list4 = new ArrayList<>();
        list4.add(3.14);
        list4.add(25.89);
        list4.add(45.32);

        System.out.println(summ(list4)); // 74.35

        System.out.println("----------------------------------");

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(56);
        list5.add(5);
        list5.add(9);
        list5.add(23);

        System.out.println(summ(list5)); // 93.0

    }

    public static void showMyList(List<?> list) {
        System.out.println("My list: " + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double sum = 0;

        for (Number n : al) {
            sum += n.doubleValue();
        }

        return sum;
    }

}





















