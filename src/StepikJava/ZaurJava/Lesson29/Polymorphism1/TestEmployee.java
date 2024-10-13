package StepikJava.ZaurJava.Lesson29.Polymorphism1;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeNotAbstract emp1 = new Doctor();  // здесь происходит Upcasting
        EmployeeNotAbstract emp2 = new Driver();  // здесь происходит Upcasting
        EmployeeNotAbstract emp3 = new Teacher();  // здесь происходит Upcasting
        EmployeeNotAbstract emp4 = new EmployeeNotAbstract();
        Helpable h1 = new Doctor();


        System.out.println(emp1.age);

        //но переменную specialization класса Doctor так мы не сможем вывести, только через casting (если есть отношение IS-A)
        Doctor doctor1 = (Doctor) emp1;
        System.out.println(doctor1.specialization);

        // можно еще так сделать
        System.out.println(((Doctor) emp1).specialization);

        h1.help();  // "Doctor is helping!"
        System.out.println(((Doctor) h1).specialization); // но если окажется, что h1 не является объектом Doctor, то возникнет исключение!

        // Driver d1 = (Driver) emp1;  // Exception in thread "main" java.lang.ClassCastException  ERROR

        System.out.println("----------------------------------------");

        EmployeeNotAbstract[] arrayEmp = {emp1, emp2, emp3, emp4};
        for (EmployeeNotAbstract e : arrayEmp) {
            if (e instanceof Driver) {  // защита от runtime exception
                System.out.println(((Driver) e).nameOfCars);
            } else {
                System.out.println("This isn't a object of Driver");
            }
        }
    }
}
























