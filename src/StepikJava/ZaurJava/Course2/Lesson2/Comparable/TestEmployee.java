package StepikJava.ZaurJava.Course2.Lesson2.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employyList = new ArrayList<>();
        Employee worker1 = new Employee(100, "Ivan", "Ivanov", 1254.56);
        Employee worker2 = new Employee(21, "Ivan", "Sidorov", 2654.12);
        Employee worker3 = new Employee(58, "Petr", "Petrov", 3546.23);
        employyList.add(worker1);
        employyList.add(worker2);
        employyList.add(worker3);

        System.out.println("Before sorting\n" + employyList);
        Collections.sort(employyList);
        System.out.println("After sorting\n" + employyList);
    }
}
