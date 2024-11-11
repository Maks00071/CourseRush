package StepikJava.ZaurJava.Course1.Lesson27.Homework;

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings!");
    }

}
