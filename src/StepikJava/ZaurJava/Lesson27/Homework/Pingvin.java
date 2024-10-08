package StepikJava.ZaurJava.Lesson27.Homework;

public class Pingvin extends Bird {

    Pingvin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Пингвин любит есть рыбу!");
    }

    @Override
    public void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу!");
    }

    @Override
    public void fly() {
        System.out.println("Пингвины не умеют летать!");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеет петь как соловей!");
    }

}
