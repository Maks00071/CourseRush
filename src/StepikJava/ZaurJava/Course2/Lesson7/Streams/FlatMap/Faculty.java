package StepikJava.ZaurJava.Course2.Lesson7.Streams.FlatMap;

import StepikJava.ZaurJava.Course2.Lesson6.Student;

import java.util.ArrayList;
import java.util.List;


public class Faculty {
    private String name;
    private List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudentsToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }
}
