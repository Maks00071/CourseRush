package StepikJava.ZaurJava.Lesson11;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double salary) {
        this(name);
        this.salary = salary;
    }

    /**
     * Getter for name
     * @return (String) name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name - name of staff
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for salary
     * @return - (double) salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter for salary
     * @param salary - salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double x) {
        System.out.println("Увеличили зарплату работнику " + name + " на $" + x);
        double result =  this.salary + x;
        setSalary(result);
    }

    @Override
    public String toString() {
        return "The Employee " + name + " has a salary = $" + salary;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        Employee emp2 = new Employee("Petr", 125.67);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println("----------------------");
        emp1.increaseSalary(50.00);
        System.out.println(emp1.toString());
    }
}






























