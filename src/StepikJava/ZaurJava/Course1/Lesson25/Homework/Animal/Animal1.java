package StepikJava.ZaurJava.Course1.Lesson25.Homework.Animal;

public class Animal1 {
    private int eyes;

    public Animal1(int eyes) {
        this.eyes = eyes;
        System.out.println("I'm animal!");
    }

    public void eat() {
        System.out.println("Animal eats!");
    }

    public void drink() {
        System.out.println("Animal drinks!");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
