package Module2.Level1.Lesson.AbstractClass;

public class Sedan extends Car {

    @Override
    public void gas() {
        System.out.println("Седан газует!");
    }

    @Override
    public void brake() {
        System.out.println("Седан тормозит!");
    }
}
