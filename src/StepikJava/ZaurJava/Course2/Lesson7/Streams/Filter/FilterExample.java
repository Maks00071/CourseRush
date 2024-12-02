package StepikJava.ZaurJava.Course2.Lesson7.Streams.Filter;

import StepikJava.ZaurJava.Course2.Lesson6.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilterExample {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // отфильтруем студентов по возрасту и оценке
        List<Student> newStudents = students.stream().filter(element -> (
                element.getAge() > 22 && element.getAvgGrade() < 7.2)).collect(Collectors.toList());

        System.out.println(newStudents);
        // [
        // Student{name='Nikolay', sex=m, age=28, course=2, avgGrade=6.4},
        // Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}
        // ]

        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .map(x -> x * x)
                .forEach(x -> System.out.format("after map: %d%n", x));
    }
}
