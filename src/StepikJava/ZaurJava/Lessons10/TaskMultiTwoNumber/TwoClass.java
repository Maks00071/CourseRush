package StepikJava.ZaurJava.Lessons10.TaskMultiTwoNumber;

public class TwoClass {
    public static void main(String[] args) {
        OneClass oneClass = new OneClass();

        System.out.println(OneClass.multiPlayThree(2, 3, 4));

        OneClass.divTwo(5, 3);

        System.out.println(oneClass.getAreaCircle(2.50));

        System.out.println(OneClass.getCircumference(2.50));

        oneClass.getInfo(2.50);
    }
}
