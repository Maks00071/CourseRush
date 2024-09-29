package StepikJava.ZaurJava.Lesson26.MethodSuper;

public class A10 {
    String s1 = "Hello!";
    static double d1 = 3.14;

    int summa(int ... i) {
        int result = 0;

        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("This is the static method!");
    }
}
