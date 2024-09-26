package StepikJava.ZaurJava.Lesson25.Homework.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student(new StringBuilder("Ivan"), 3, 7);
        Student st2 = new Student(new StringBuilder("Petr"), 2, 8);
        Student st3 = new Student(new StringBuilder("Mila"), 1, 9);

        st1.showInfo();
        st2.showInfo();
        st3.showInfo();

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
