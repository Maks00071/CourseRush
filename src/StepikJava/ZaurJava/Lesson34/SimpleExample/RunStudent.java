package StepikJava.ZaurJava.Lesson34.SimpleExample;

import java.util.ArrayList;

public class RunStudent {
    public static void main(String[] args) {
        StudentInfo info = new StudentInfo();

        Student st1 = new Student("Petr", 'm', 18);
        Student st2 = new Student("Olga", 'f', 19, 1);
        Student st3 = new Student("Misha", 'm', 21, 3, 8.9);
        Student st4 = new Student("Denis", 'm', 23, 5, 7.9);
        Student st5 = new Student("Ira", 'f', 25, 4, 9.0);

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        info.printStudentInfo1(st1);
        System.out.println("-----------------------------------------------------------------");
        info.printStudentsOverGrade(studentList, 8);
    }
}
