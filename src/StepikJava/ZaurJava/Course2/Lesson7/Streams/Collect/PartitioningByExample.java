package StepikJava.ZaurJava.Course2.Lesson7.Streams.Collect;

import StepikJava.ZaurJava.Course2.Lesson6.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PartitioningByExample {
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

        Map<Boolean, List<Student>> listMap2 = students.stream().collect(Collectors.partitioningBy(element -> element.getAvgGrade() > 8));

        for (Map.Entry<Boolean, List<Student>> entry : listMap2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

            /*
            false: [Student{name='Nikolay', sex=m, age=28, course=2, avgGrade=6.4}, Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}]
            true: [Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}, Student{name='Elena', sex=f, age=19, course=1, avgGrade=8.9}, Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}]
             */
        }
    }
}
