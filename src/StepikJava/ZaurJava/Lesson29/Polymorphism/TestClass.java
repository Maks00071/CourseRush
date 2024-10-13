package StepikJava.ZaurJava.Lesson29.Polymorphism;

public class TestClass {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        emp1.work();  // "Teacher works!"
        emp2.work();  // "Driver works!"
        emp3.work();  // "Doctor works!"

        Employee[] arrayEmp = {emp1, emp2, emp3};
        for (Employee emp : arrayEmp) {
            emp.work();
        }

        // оператор instanceof
        System.out.println(emp1 instanceof Employee); // true
        System.out.println(emp1 instanceof Teacher);  // true
        System.out.println(emp1 instanceof Driver);  // false

        System.out.println(null instanceof Object);  // false


    }
}
