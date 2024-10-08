package StepikJava.ZaurJava.Lesson27.Homework;

public class Leon extends Mammal {

    Leon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Лев, как любой хищник, любит мясо!");
    }

    @Override
    public void sleep() {
        System.out.println("Большую часть дня лев спит!");
    }

    @Override
    public void run() {
        System.out.println("Лев - это не самая быстрая кошка!");
    }

}
