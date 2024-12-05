package StepikJava.ZaurJava.Course2.Lesson7.Streams.Skip;

import StepikJava.ZaurJava.Course2.Lesson6.Student;

import java.util.ArrayList;


public class SkipExample {
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

        students.stream().filter(element -> element.getAge() > 20).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        students.stream().filter(element -> element.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        students.stream().filter(element -> element.getAge() > 20).skip(2).forEach(System.out::println);

        /*
        Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}
        Student{name='Nikolay', sex=m, age=28, course=2, avgGrade=6.4}
        Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}
        Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}
        --------------------------------------------------
        Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}
        Student{name='Nikolay', sex=m, age=28, course=2, avgGrade=6.4}
        --------------------------------------------------
        Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}
        Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}
         */
    }
}