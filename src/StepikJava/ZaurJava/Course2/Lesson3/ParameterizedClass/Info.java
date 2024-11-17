package StepikJava.ZaurJava.Course2.Lesson3.ParameterizedClass;

public class Info<T> {

    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[ " + value + " ]}";
    }

    public T getValue() {
        return value;
    }

}
