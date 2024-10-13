package StepikJava.ZaurJava.Lesson29.Polymorphism1;

public class Driver extends EmployeeNotAbstract {
    int countOfCars;
    String nameOfCars = "Mers";

//    @Override
//    public void work() {
//        System.out.println("Driver works!");
//    }

    public void toDriver() {
        System.out.println("The Driver is drivering!");
    }
}
