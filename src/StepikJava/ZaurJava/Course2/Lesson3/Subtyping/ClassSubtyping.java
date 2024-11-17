package StepikJava.ZaurJava.Course2.Lesson3.Subtyping;

public class ClassSubtyping {
    public static void main(String[] args) {
        InfoSubtypingInt<Integer> info1 = new InfoSubtypingInt<>(18);
        InfoSubtypingInt<Double> info2 = new InfoSubtypingInt<>(3.14);

        System.out.println(info1.toString()); // "{[ 18 ]}"
        System.out.println(info2.toString()); // "{[ 3.14 ]}"
    }
}
