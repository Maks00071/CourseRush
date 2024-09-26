package StepikJava.ZaurJava.Lesson25.Homework.Animal;

public class Dog extends Pet {

    private String name;

    public Dog(String name) {
        super(name);
        System.out.println("I'm a dog and mein name is " + this.name);
    }
}
