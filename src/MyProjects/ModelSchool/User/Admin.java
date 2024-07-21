package MyProjects.ModelSchool.User;

import MyProjects.ModelSchool.Group;
import MyProjects.ModelSchool.School;

import java.time.LocalDate;
import java.util.List;

public class Admin extends User {

    School school;

    // реализуем конструкторы:

    // переопределим первый конструктор родителя
    public Admin() {
        super();
    }

    // переопределим второй конструктор родителя
    public Admin(String name, String password) {
        super(name, password);
    }

    // переопределим третий конструктор родителя
    public Admin(String name, String password, LocalDate dateOfBirth) {
        super(name, password, dateOfBirth);
    }

    /**
     * Метод создает новую группу в школе
     * @param groupName - название группы
     * @param teacher - учитель
     * @param students - список студентов
     * @return - новый объект Group
     */
    public Group createGroup(String groupName, Teacher teacher, List<Student> students) {
        return new Group(groupName, teacher, students);
    }

    public void setSchool(School school) {
        this.school = school;
    }

    /**
     * Метод регистрирует студентов в системе школы
     * @param name - имя студента
     */
    public void registerStudent(String name) {
        school.getStudents().add(new Student(name, "defaultPassword"));
    }
}

















