package StepikJava.ZaurJava.Course2.Lesson4.Collection.TreeMapCol;

import java.util.Objects;

public final class StudentTreeMap implements Comparable<StudentTreeMap>{

    final private String name;
    final private String surname;
    final private int course;

    public StudentTreeMap(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + "'" +
                ", surname='" + surname + "'" +
                ", course=" + course +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        StudentTreeMap student = (StudentTreeMap) obj;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(StudentTreeMap obj) {
        return this.name.compareTo(obj.name);
    }
}























