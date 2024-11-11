package StepikJava.ZaurJava.Course1.Lesson27.Homework;

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
    }

    abstract void run();

}
