package StepikJava.ZaurJava.ProjectEmployee;

public class Employee {

    private int id;
    private String surname;
    private double age;
    private double salary;

    public Employee(int id, String surname, double age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    public Employee(int id, String surname, double age, double salary) {
        this(id, surname, age);
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Метод увеличивает параметр salary в два раза
     */
    public void increaseSalary() {
        this.salary *= 2;
    }

    @Override
    public String toString() {
        return "The employee " + surname + " has a salary = $" + salary;
    }

}




















