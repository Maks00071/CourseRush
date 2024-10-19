package StepikJava.ZaurJava.Lesson29.Homework;

public class Bird extends Animal implements Speakable{

    String name;

    public Bird(String name) {
        super(name);
    }

    public void fly() {
    };

    @Override
    public void speak() {
        System.out.println(name + " sings!");
    }

}
