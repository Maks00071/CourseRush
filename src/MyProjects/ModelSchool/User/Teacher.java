package MyProjects.ModelSchool.User;

import MyProjects.ModelSchool.Group;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    String expertise; // экспертиза учителя
    List<Group> groups; // список групп, в которых преподает учитель

    // реализуем конструкторы:

    // переопределим первый конструктор родителя
    public Teacher(String expertise) {
        super(); // первый вызов конструктора родителя
        // достраиваем конструктор
        this.expertise = expertise;
        this.groups = new ArrayList<>();
    }

    // переопределим второй конструктор родителя
    public Teacher(String name, String password, String expertise) {
        super(name, password);
        this.expertise = expertise;
        this.groups = new ArrayList<>();
    }

    // переопределим третий конструктор родителя
    public Teacher(String name, String password, LocalDate dateOfBirth, String expertise, List<Group> groups) {
        super(name, password, dateOfBirth);
        this.expertise = expertise;
        this.groups = groups;
    }
}























