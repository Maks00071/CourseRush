package MyProjects.ModelSchool;

import MyProjects.ModelSchool.User.Student;
import MyProjects.ModelSchool.User.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private static int counter = 1;

    int id; // идентификатор группы
    String name; // название группы

    Teacher teacher; // учитель в группе
    List<Student> students; // список студентов группы
    List<Lesson> lessons; // список лекций группы

    // реализуем конструктор
    public Group(String name, Teacher teacher) {
        this.id = counter++;
        this.name = name;
        this.teacher = teacher;
        this. students = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }
}






























