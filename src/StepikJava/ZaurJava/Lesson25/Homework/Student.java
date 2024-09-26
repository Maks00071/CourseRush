package StepikJava.ZaurJava.Lesson25.Homework;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;


    public Student(StringBuilder name) {
        this.name = name;
    }

    public Student(StringBuilder name, int course, int grade) {
        this(name);
        this.course = course;
        this.grade = grade;
    }


    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println(String.format("The student has a name: %s. He studies at course: %d. His grade is %d", name, course, grade));
    }

    @Override
    public String toString() {
        return "The student si " + name + "." + " He studies at course: " + course + "." + " His grade is " + grade;
    }

}






























