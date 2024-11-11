package StepikJava.ZaurJava.Course1.Lesson29.Homework;

public class Pingvin extends Bird {

    String name;

    public Pingvin(String name) {
        super(name);
        this.name = name;
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
