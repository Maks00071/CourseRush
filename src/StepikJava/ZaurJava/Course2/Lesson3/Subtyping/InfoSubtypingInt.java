package StepikJava.ZaurJava.Course2.Lesson3.Subtyping;

public class InfoSubtypingInt<T extends Number> {

    private T value;

    public InfoSubtypingInt(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{[ " + value + " ]}";
    }

}
