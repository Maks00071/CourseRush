package StepikJava.ZaurJava.Course2.Lesson7.Streams.MinMax;

import StepikJava.ZaurJava.Course2.Lesson6.Student;

import java.util.ArrayList;
import java.util.Comparator;


public class MinAndMaxExample {
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

        Student minAge = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(minAge);
        // udent{name='Elena', sex=f, age=19, course=1, avgGrade=8.9}

        Student maxAvgGrade = students.stream().max(Comparator.comparingDouble(Student::getAvgGrade)).get();
        System.out.println(maxAvgGrade);
    }
}
