package StepikJava.ZaurJava.Course2.Lesson3.ParameterizedClass;

public class ParametClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello!");
        System.out.println(info1.toString());  // "{[ Hello! ]}"
        String s1 = info1.getValue();

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2.toString());  // "{[ 18 ]}"
        Integer i1 = info2.getValue();
    }
}
