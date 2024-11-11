package StepikJava.ZaurJava.Course1.Lesson27.AbstractClassEmployee;

public interface Swim_able {

    void swim();
    default void swimDefault() {
        System.out.println("This is the default's method!");
    }

}
