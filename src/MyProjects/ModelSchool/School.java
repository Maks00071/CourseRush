package MyProjects.ModelSchool;

import MyProjects.ModelSchool.User.Admin;
import MyProjects.ModelSchool.User.Student;
import MyProjects.ModelSchool.User.Teacher;

import java.util.ArrayList;
import java.util.List;

public class School {

    String name; // название школы

    List<Group> groups;
    List<Admin> admins;
    List<Teacher> teachers;
    List<Student> students;

    // реализуем конструтор
    public School(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", groups=" + groups +
                ", admins=" + admins +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }
}










































