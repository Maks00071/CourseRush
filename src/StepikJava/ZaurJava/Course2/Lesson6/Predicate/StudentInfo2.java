package StepikJava.ZaurJava.Course2.Lesson6.Predicate;

import StepikJava.ZaurJava.Course2.Lesson6.Student;
import java.util.ArrayList;
import java.util.function.Predicate;


public class StudentInfo2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(st1);
        students2.add(st2);
        students2.add(st3);
        students2.add(st4);
        students2.add(st5);

        StudentInfo2 studentInfo2 = new StudentInfo2();

        studentInfo2.testStudents2(students2, (Student st) -> st.getAvgGrade() > 8);
        /*
        Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}
        Student{name='Elena', sex=f, age=19, course=1, avgGrade=8.9}
        Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}
         */

    }

    public void testStudents2(ArrayList<Student> students, Predicate<Student> pr) {
        for (Student s : students) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}




















