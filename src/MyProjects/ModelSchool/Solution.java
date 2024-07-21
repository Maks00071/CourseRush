package MyProjects.ModelSchool;

/*
* Делаем модель онлайн-школы. Нужные нам классы (сущности):
* School, Group, Student, Teacher, Admin, Lesson
* Связи (relations):
*  - School  --> HAS A --> Group[]
*  - Group   --> HAS A --> Teacher
*  - Group   --> HAS A --> Student[]
*  - Student --> HAS A --> Group[]
*  - Group   --> HAS A --> Lesson[]
*  - School  --> HAS A --> Admin[]
*  - School  --> HAS A --> Teacher[]
*  - School  --> HAS A --> Student[]
*  - Lesson  --> HAS A --> Teacher
*  - Lesson  --> HAS A --> Student[]
 */


import MyProjects.ModelSchool.User.Admin;
import MyProjects.ModelSchool.User.Teacher;

public class Solution {
    public static void main(String[] args) {
        // создаем школу
        School j_r = new School("Java Rush");
        // создаем админа
        Admin admin = new Admin("admin", "password");
        admin.setSchool(j_r);
        // создадим персонал (2 учителя)
        Teacher pavel = new Teacher("Pavel", "pav", "java");
        Teacher sveta = new Teacher("Sveta", "svt", "python");
        // админ регистрирует студентов
        admin.registerStudent("Will");
        admin.registerStudent("Bill");
        admin.registerStudent("Greg");
        // создаем новую группу
        Group oscar = admin.createGroup("Oscar", pavel, j_r.getStudents());
        // учитель создает лекцию
        Lesson today = pavel.createLesson("OOP", "lecture", oscar.getStudents());
        // добавим лекцию в список
        oscar.getLessons().add(today);
    }
}

























