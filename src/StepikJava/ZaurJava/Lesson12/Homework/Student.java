package StepikJava.ZaurJava.Lesson12.Homework;

public class Student {
    private String name;
    private int course;
    private double grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int course) {
        this(name);
        this.course = course;
    }

    public Student(String name, int course, double grade) {
        this(name, course);
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

}























