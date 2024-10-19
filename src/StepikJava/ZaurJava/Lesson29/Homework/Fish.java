package StepikJava.ZaurJava.Lesson29.Homework;

public class Fish extends Animal{

    String name;

    public Fish(String name) {
        super(name);
    }

    public void swim() {
    };

    @Override
    public void sleep() {
        System.out.println("Всегда было интересно наблюдать, как спят рыбы!");
    }

}
