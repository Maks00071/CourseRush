package StepikJava.ZaurJava.Course2.Lesson4.Collection.CollectionsClass;

import org.jetbrains.annotations.NotNull;


public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary + "$";
    }

    @Override
    public int compareTo(@NotNull Employee otherEmployee) {
        int result = this.id - otherEmployee.id;

        if (result == 0) {
            return this.name.compareTo(otherEmployee.name);
        }
        return result;
    }
}




























