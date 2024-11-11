package StepikJava.ZaurJava.Course1.Lesson27.Homework;

public interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks!");
    }

}
