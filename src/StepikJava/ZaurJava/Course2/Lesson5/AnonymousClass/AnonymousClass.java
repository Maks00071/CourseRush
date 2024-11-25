package StepikJava.ZaurJava.Course2.Lesson5.AnonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {

        Math m1 = new Math() {
            @Override
            public int doOperation(int x, int y) {
                return x + y;
            }
        };

        System.out.println(m1.doOperation(3, 6)); // 9

        Math m2 = new Math() {
            @Override
            public int doOperation(int x, int y) {
                return x * y;
            }
        };

        System.out.println(m2.doOperation(3, 6)); // 18
    }
}
