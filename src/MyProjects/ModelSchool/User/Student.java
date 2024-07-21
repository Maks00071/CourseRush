package MyProjects.ModelSchool.User;

import MyProjects.ModelSchool.Group;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends User {

    List<Group> groups; // список посещаемых студентом групп

    // реализуем конструкторы:

    // реализуем "нулевой" конструктор
    public Student() {
        this.groups = new ArrayList<>();
    }

    // переопределим первый конструктор родителя
    public Student(List<Group> groups) {
        super(); // первый вызов конструктора родителя
        this.groups = groups; // достраиваем конструктор
    }

    // переопределим второй конструктор родителя
    public Student(String name, String password) {
        super(name, password);
        this.groups = new ArrayList<>();
    }

    // переопределим третий конструктор родителя
    public Student(String name, String password, LocalDate dateOfBirth, List<Group> groups) {
        super(name, password, dateOfBirth);
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groups=" + groups +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}






















