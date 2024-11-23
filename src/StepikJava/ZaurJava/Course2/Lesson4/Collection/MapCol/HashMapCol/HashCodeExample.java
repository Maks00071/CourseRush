package StepikJava.ZaurJava.Course2.Lesson4.Collection.MapCol.HashMapCol;

import java.util.HashMap;
import java.util.Map;


public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> mapStudent = new HashMap<>();
        Student st1 = new Student("Maks", "Petrov", 3);
        Student st2 = new Student("Maria", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);

        mapStudent.put(st1, 7.5);
        mapStudent.put(st2, 8.7);
        mapStudent.put(st3, 9.2);

        System.out.println(mapStudent);
        // {
        // Student{name='Maks', surname='Petrov', course=3}=7.5,
        // Student{name='Sergey',surname='Petrov', course=4}=9.2,
        // Student{name='Maria', surname='Ivanova', course=1}=8.7
        // }

        Student st4 = new Student("Maks", "Petrov", 3);
        boolean isContains = mapStudent.containsKey(st4);
        System.out.println(isContains); // true

        System.out.println(st1.hashCode()); // -1009583548
        System.out.println(st3.hashCode()); // -1877008508
        System.out.println(st4.hashCode()); // -1009583548

    }
}
