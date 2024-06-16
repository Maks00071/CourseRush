package Module1.Level23.Tasks.CanNotClose;

public class MyClass implements java.io.Serializable {
    private final String string;

    public MyClass(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "string='" + string + '\'' +
                '}';
    }
}
