package Module1;

public class TestGenerics {
    public static void main(String[] args) {
        Object[] objects = {10, "Hello", 3.14};

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof String) {
                String s = (String) objects[i];
                System.out.println(s);
            } else {
                System.out.printf("%s не является типом String%n", objects[i]);
            }
        }
    }
}
