package StepikJava.ZaurJava.Course1.Lesson25.Homework.Animal;

public class Dog extends Pet1 {

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

    @Override
    public int getPaw() {
        return 1;
    }
}
