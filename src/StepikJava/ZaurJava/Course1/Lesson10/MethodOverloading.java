package StepikJava.ZaurJava.Course1.Lesson10;

public class MethodOverloading {

    public void show(int i) {
        System.out.println("This is an Integer = " + i);
    }

    public void show(boolean b) {
        System.out.println("This is a boolean = " + b);
    }

    public void show(String s) {
        System.out.println("This is a string = " + s);
    }

    public void muster(String s, int i) {
        System.out.println(s);
        System.out.println(i);
    }

    public void muster(int i, String s) {
        System.out.println(s);
        System.out.println(i);
    }

}





class TestMethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();

        int i1 = 10;
        boolean b1 = true;
        String s1 = "Hello";

        mO.show(b1);
        mO.show(i1);
        mO.show(s1);

        mO.muster(1, "Hello");
        mO.muster("Hello", 1);
    }
}


















