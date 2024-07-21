package MyProjects.ModelSchool;

import MyProjects.ModelSchool.User.Student;
import MyProjects.ModelSchool.User.Teacher;

import java.util.List;

public class Lesson {

    private static int counter = 1;

    int id; // идентификатор лекции
    Teacher teacher; // учитель данной лекции
    String topic; // название лекции
    String materials; // материал лекции
    List<Student> students; // список посещаемости

    // реализуем конструктор
    public Lesson(Teacher teacher, String topic, String materials, List<Student> students) {
        this.id = counter++;
        this.topic = topic;
        this.materials = materials;
        this.students = students;
    }

    /**
     * Метод начинает лекцию
     */
    public void startLesson() {
        System.out.println("Lesson started!");
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", teacher=" + teacher +
                ", topic='" + topic + '\'' +
                ", materials='" + materials + '\'' +
                ", students=" + students +
                '}';
    }
}




































