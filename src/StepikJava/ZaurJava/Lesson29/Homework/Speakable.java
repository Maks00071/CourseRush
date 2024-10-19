package StepikJava.ZaurJava.Lesson29.Homework;

public interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks!");
    }

}
