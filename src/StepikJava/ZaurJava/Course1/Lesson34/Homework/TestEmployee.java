package StepikJava.ZaurJava.Course1.Lesson34.Homework;

import java.util.function.*;
import java.util.ArrayList;


public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> emplArray = new ArrayList<>();
        Employee empl1 = new Employee("Petr", "IT", 350);
        Employee empl2 = new Employee("Ekaterina", "Sales", 180);
        Employee empl3 = new Employee("Nikolay", "Delivery", 210);
        Employee empl4 = new Employee("Build", "Build", 380);
        Employee empl5 = new Employee("Eric", "IT", 450);

        emplArray.add(empl1);
        emplArray.add(empl2);
        emplArray.add(empl3);
        emplArray.add(empl4);
        emplArray.add(empl5);

        filterEmployee(emplArray, (Employee e) -> e.getDepartment().equals("IT") && e.getSalary() > 200);
        filterEmployee(emplArray, (Employee e) -> e.getName().startsWith("E") && e.getSalary() != 450);
        filterEmployee(emplArray, (Employee e) -> e.getName().equals(e.getDepartment()));

    }

    /**
     * Метод выводит информацию о работнике
     * @param empl объект Employee
     */
    public static void printEmployee(Employee empl) {
        System.out.println("The Employee has a name: " + empl.getName()
                + "; a department: " + empl.getDepartment()
                + "; a salary: " + empl.getSalary() + ".");
    }

    /**
     * Метод проверяет соответствует ли работник определенным критериям
     * @param list ArrayList<Employee>
     * @param predicate Predicate
     */
    public static void filterEmployee(ArrayList<Employee> list, Predicate<Employee> predicate) {
        for (Employee e : list) {
            if (predicate.test(e)) {
                printEmployee(e);
            }
        }
    }
}
