package StepikJava.ZaurJava.Course1.Lesson26.Overriding;

public class TestOverriding {

    public void abc(Animal a) {
        System.out.println("A");
    }

    public void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        TestOverriding test1 = new TestOverriding();
        Animal an = new Mouse();
        test1.abc(an);  // "A" - определяется по типу переменной
        an.getName();  // "Mouse" - определяется по объекту
    }
}


