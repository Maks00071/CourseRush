package StepikJava.ZaurJava.Lesson10.NonAccessMidifiers;

public class StaticStudent {
    public String name;
    public int course;
    static int count;  // счетчик ко-ва созданных студентов
    int a;
    /*
    Без non-access modidifiers static у каждого объекта свой индивидульный счетчик:
    Student #1 has been created.
    Student #1 has been created.
    Student #1 has been created.

    с non-access modidifiers static счетчик у класса, а не у экземпляра класса:
    Student #1 has been created.
    Student #2 has been created.
    Student #3 has been created.
     */

    public StaticStudent(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student #" + count + " has been created.");
    }

    /**
     * Static method выводит на экран общее кол-во созданныъ студентов
     */
    public static void showCount() {
        System.out.println("There is total created students: " + count);
        StaticStudent st4 = new StaticStudent("Nikolay", 3);
        System.out.println(st4.a);
    }

    /**
     * Non-static method
     */
    public void showInfo() {
        System.out.println("Welcome to the Student class!!!");
    }

    void abc() {

    }
}

class TestStudent {
    public static void main(String[] args) {
        StaticStudent st1 = new StaticStudent("Ivan", 1);
        StaticStudent st2 = new StaticStudent("Petr", 4);
        StaticStudent st3 = new StaticStudent("Masha", 2);

        // посмотрим общее кол-во созданных студентов
        System.out.println(StaticStudent.count);
        StaticStudent.showCount();
    }
}























