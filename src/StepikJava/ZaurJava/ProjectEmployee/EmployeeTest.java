package StepikJava.ZaurJava.ProjectEmployee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Petr Petrov", 35, 2588.56);
        Employee employee2 = new Employee(2, "Ivan Ivanov", 49, 3459.89);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
