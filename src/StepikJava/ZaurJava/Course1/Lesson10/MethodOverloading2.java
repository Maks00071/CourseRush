package StepikJava.ZaurJava.Course1.Lesson10;

public class MethodOverloading2 {

    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    public String sum(String s1, String s2) {
        return s1 + s2;
    }

}


class TestMethodOverloading2 {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();

        int a = mO2.sum(1, 2);
        String str = mO2.sum("Hello, ", "my friend!");

        System.out.println(a);
        System.out.println(str);
    }
}
