package StepikJava.ZaurJava.Course1.Lesson25.Homework.Animal;

public class Cat extends Pet1 {
    private String name;

    public Cat(String name) {
        this.name = name;
        System.out.println("I'm a cat and my name is " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Cat sleeps!");
    }
}
