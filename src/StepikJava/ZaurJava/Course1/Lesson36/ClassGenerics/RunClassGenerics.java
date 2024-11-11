package StepikJava.ZaurJava.Course1.Lesson36.ClassGenerics;


public class RunClassGenerics {
    public static void main(String[] args) {
        ClassGenerics<String> cg1 = new ClassGenerics<>("Hello!");
        System.out.println(cg1.toString()); // "[{ Hello! }]"

        ClassGenerics<Integer> cg2 = new ClassGenerics<>(100);
        System.out.println(cg2.toString()); // "[{ 100 }]"
    }
}
