package MyProjects.ModelSchool.User;

import MyProjects.ModelSchool.Group;
import MyProjects.ModelSchool.Lesson;

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

    /**
     * Метод создает объект лекция
     * @param topic - название лекции
     * @param materials - материал лекции
     * @param students - список студентов
     * @return - новый объект Lesson
     */
    public Lesson createLesson(String topic, String materials, List<Student> students) {
        return new Lesson(this, topic, materials, students);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "expertise='" + expertise + '\'' +
                ", groups=" + groups +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}























