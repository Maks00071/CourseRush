package StepikJava.ZaurJava.Course1.Lesson27.Homework;

public class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
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
