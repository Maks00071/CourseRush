package StepikJava.ZaurJava.Lesson10.TaskMultiTwoNumber;

public class OneClass {

    public static final double PI = 3.14;

    public static int multiPlayThree(int a, int b, int c) {
        return a * b * c;
    }

    public static void divTwo(int a, int b) {
        System.out.println((double) a / b);
    }

    public double getAreaCircle(double rad) {
        return PI * rad * rad;
    }

    public static double getCircumference(double rad) {
        return 2 * PI * rad;
    }

    public void getInfo(double rad) {
        System.out.println("The radius = " + rad);
        System.out.println("The area of the circle = " + getAreaCircle(rad));
        System.out.println("The circumference = " + getCircumference(rad));
    }

}































