package StepikJava.ZaurJava.Lesson29.Polymorphism2;

public class TestHuman {
    public static void main(String[] args) {
        Jumpable jmp = new Man();
        Man man1 = new Man();
        Student student1 = new Student();

        if (jmp instanceof Jumpable) {
            System.out.println("jmp is Jumpable!");
        }

        if (man1 instanceof Human) {
            System.out.println("man1 is Human!");
        }

    }
}
