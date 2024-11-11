package StepikJava.ZaurJava.Course2.Lesson2.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(25, "Ivan", "Ivanov");
        Student student2 = new Student(10, "Petr", "Petrov");
        Student student3 = new Student(124, "Nikolay", "Sidorov");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("---------------Before sorting---------------");
        for (Student st : studentList) {
            System.out.println(st.toString());
        }

        System.out.println("---------------After sorting by id-----------------");
        Collections.sort(studentList);
        for (Student st : studentList) {
            System.out.println(st.toString());
        }

        System.out.println("---------------After sorting by name-----------------");
        Collections.sort(studentList, new NameComparator());
        for (Student st : studentList) {
            System.out.println(st.toString());
        }
    }
}
