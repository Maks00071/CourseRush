package StepikJava.ZaurJava.Lesson27.Homework;

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
    }

    abstract void run();

}
