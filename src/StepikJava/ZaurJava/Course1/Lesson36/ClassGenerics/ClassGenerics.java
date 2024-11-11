package StepikJava.ZaurJava.Course1.Lesson36.ClassGenerics;

public class ClassGenerics<T> {

    private T value;

    public ClassGenerics (T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[{ " + value + " }]";
    }

    public T getValue() {
        return value;
    }

}
