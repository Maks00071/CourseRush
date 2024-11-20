package StepikJava.ZaurJava.Course2.Lesson4.Collection.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        System.out.println("------------------- the next example ------------------------");

        Employee emp1 = new Employee(15, "Ivan", 6542);
        Employee emp2 = new Employee(123, "Petr", 8542);
        Employee emp3 = new Employee(15, "Mariya", 5678);
        Employee emp4 = new Employee(182, "Nikolay", 125);
        Employee emp5 = new Employee(15, "Sasha", 9874);
        Employee emp6 = new Employee(250, "Elena", 1579);
        Employee emp7 = new Employee(100, "Maks", 12345);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);

        System.out.println("------------------- the next example ------------------------");

        int indexEmp1 = Collections.binarySearch(employeeList, new Employee(15, "Sasha", 9874));
        System.out.println(indexEmp1); // 2

    }
}




























