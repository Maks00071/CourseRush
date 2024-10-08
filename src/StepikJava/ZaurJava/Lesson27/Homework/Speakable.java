package StepikJava.ZaurJava.Lesson27.Homework;

public interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks!");
    }

}
