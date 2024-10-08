package StepikJava.ZaurJava.Lesson27.Homework;

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
    }

    abstract void swim();

    public void sleep() {
        System.out.println("Всегда было интересно наблюдать, как спят рыбы!");
    }

}
