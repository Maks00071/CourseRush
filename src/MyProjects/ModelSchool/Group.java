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
    public Group(String name, Teacher teacher, List<Student> students) {
        this.id = counter++;
        this.name = name;
        this.teacher = teacher;
        this. students = students;
        this.lessons = new ArrayList<>();
    }

    /**
     * Геттер - возвращает список студентов
     * @return - список студентов
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Геттер - возвращает список лекций
     * @return - список лекций
     */
    public List<Lesson> getLessons() {
        return lessons;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                ", lessons=" + lessons +
                '}';
    }
}






























