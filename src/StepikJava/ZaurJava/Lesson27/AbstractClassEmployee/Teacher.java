package StepikJava.ZaurJava.Lesson27.AbstractClassEmployee;

public class Teacher extends Employee implements Help_able, Swim_able {

    @Override
    public void eat() {
        System.out.println("Teacher is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Teacher is sleeping!");
    }

    public void teach() {
        System.out.println("Teacher is teaching!");
    }

    public void help() {
        System.out.println("Teacher helps!");
    }

    public void swim() {
        System.out.println("Teacher swims!");
    }

}
