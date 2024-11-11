package StepikJava.ZaurJava.Course1.Lesson27.AbstractClassEmployee;

public class Driver extends Employee implements Help_able {

    @Override
    public void eat() {
        System.out.println("Driver is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Driver is sleeping!");
    }

    public void drive() {
        System.out.println("Driver is driving!");
    }

    public void help() {
        System.out.println("Driver helps!");
    }

}
