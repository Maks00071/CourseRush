package StepikJava.ZaurJava.Course2.Lesson6.Function;

import StepikJava.ZaurJava.Course2.Lesson6.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class StudentInfo3 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo3 studentInfo3 = new StudentInfo3();
        double resGrade = getAvgSometh(students, student -> student.getAvgGrade());
        System.out.println(resGrade); // 7.94

        double resCourse = getAvgSometh(students, student -> (double) student.getCourse());
        System.out.println(resCourse); // 2.6
    }

    public static double getAvgSometh(List<Student> list, Function<Student, Double> f) {
        double result = 0;

        for (Student st : list) {
            result += f.apply(st);
        }

        result = result / list.size();
        return result;
    }
}
