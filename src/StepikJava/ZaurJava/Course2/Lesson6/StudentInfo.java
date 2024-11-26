package StepikJava.ZaurJava.Course2.Lesson6;

import java.util.ArrayList;


public class StudentInfo {
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

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverGrade(students, 8);
        /*
        Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}
        Student{name='Elena', sex=f, age=19, course=1, avgGrade=8.9}
        Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}
         */

        System.out.println("-------------------------------------");

        studentInfo.printStudentsUnderAge(students, 30);
        /*
        Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}
        Student{name='Nikolay', sex=m, age=28, course=2, avgGrade=6.4}
        Student{name='Elena', sex=f, age=19, course=1, avgGrade=8.9}
        Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}
         */

        System.out.println("-------------------------------------");

        studentInfo.printStudentsMixCondition(students, 20, 9.5, 'f');
        // Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");

        // anonymous inner class
        studentInfo.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.getAge() > 30;
            }
        });
        // Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}

        System.out.println("-------------------------------------");

        // lambda expression
        studentInfo.testStudents(students, (Student s) -> (s.getAge() > 30));
        // Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}

        System.out.println("-------------------------------------");

        // lambda expression
        studentInfo.testStudents(students, (Student s) -> (s.getAvgGrade() > 8));
        /*
        Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}
        Student{name='Elena', sex=f, age=19, course=1, avgGrade=8.9}
        Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}
         */

        System.out.println("-------------------------------------");

        // lambda expression
        studentInfo.testStudents(students, (Student s) -> (s.getAge() > 20 &&
                s.getAvgGrade() < 9.5 && s.getSex() == 'f'));
        //Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}

        // лямда-выражения можно записать еще короче
        studentInfo.testStudents(students, s -> s.getSex() == 'm');
        /*
        Student{name='Mariya', sex=f, age=23, course=3, avgGrade=9.1}
        Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3}
        Student{name='Nikolay', sex=m, age=28, course=2, avgGrade=6.4}
        Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}
         */


    }

    public void printStudentsOverGrade(ArrayList<Student> students, double grade) {
        for (Student s : students) {
            if (s.getAvgGrade() > grade) {
                System.out.println(s);
            }
        }
    }

    public void printStudentsUnderAge(ArrayList<Student> students, int age) {
        for (Student s : students) {
            if (s.getAge() < age) {
                System.out.println(s);
            }
        }
    }

    public void printStudentsMixCondition(ArrayList<Student> students, int age, double grade, char sex) {
        for (Student s : students) {
            if (s.getAge() > age && s.getAvgGrade() < grade && s.getSex() == sex) {
                System.out.println(s);
            }
        }
    }

    public void testStudents(ArrayList<Student> students, StudentChecks sc) {
        for (Student s : students) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}




















