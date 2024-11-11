package StepikJava.ZaurJava.Course1.Lesson29.Homework;

public interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks!");
    }

}
