package StepikJava.ZaurJava.Lesson26.MethodSuper;

public class B10 extends A10{

    String s1 = super.s1;

    public static void main(String[] args) {
        B10 b1 = new B10();
        System.out.println(b1.s1 + " my friend!");  // "Hello! my friend!"

        int sum = b1.summa(5, 10, 105);
    }

    // overriding parent-methods
    @Override
    int summa(int ... i) {
        int result = super.summa(i);
        System.out.println("Summa = " + result); // "Summa = 120"
        return result;
    }
}
