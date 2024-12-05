package StepikJava.ZaurJava.Course2.Lesson7.Streams.mapToInt;

import StepikJava.ZaurJava.Course2.Lesson6.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;


public class MapToIntExample {
    public static void main(String[] args) {
        DoubleStream.of(0.1, Math.PI).boxed().map(Object::getClass).forEach(System.out::println);
        /*
        class java.lang.Double
        class java.lang.Double
         */

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

        List<Integer> courses = students.stream()
                .mapToInt(element -> element.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses); // [3, 2, 1, 4, 3]

        int sumCourse = students.stream().mapToInt(element -> element.getCourse()).sum();
        System.out.println(sumCourse); // 13

        double avgCourse = students.stream().mapToInt(element -> element.getCourse()).average().getAsDouble();
        System.out.println(avgCourse); // 2.6

        int minCourse = students.stream().mapToInt(element -> element.getCourse()).min().getAsInt();
        System.out.println(minCourse); // 1

        int maxCourse = students.stream().mapToInt(element -> element.getCourse()).max().getAsInt();
        System.out.println(maxCourse); // 4
    }
}






































