package StepikJava.ZaurJava.Lesson25.Homework.Animal;

public class Dog extends Pet {

    private String name;

    public Dog(String name) {
        this.name = name;
        System.out.println("I'm a dog and my name is " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Dog plays!");
    }
}
