package StepikJava.ZaurJava.Lesson29.Homework;

public class Mechenosec extends Fish{

    String name;

    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Меченосец - красивая рыба, которая быстро плавает!");
    }

    @Override
    public void eat() {
        System.out.println("Меченосец не хищная рыба, и она ест обычный рыбный корм!");
    }

}
