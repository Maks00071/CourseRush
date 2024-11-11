package StepikJava.ZaurJava.Course1.Lesson11;

public class Student {
    private String name;
    private int course;
    private double grade;
    static int count;

    public Student(String name) {
        count++;
        this.name = name;
    }

    public Student(String name, int course, double grade) {
        this(name);
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "The Student #" + count + " is " + name + ". He's at " + course + " course.";
    }

}

class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student("Ivan", 3, 9.5);
        System.out.println("std1: " + std1.toString());

        Student std2 = new Student("Petr", 1, 5.3);
        System.out.println("std2: " + std2.toString());
    }
}




















