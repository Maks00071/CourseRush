package StepikJava.ZaurJava.Lesson34.SimpleExample;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class StudentInfo {

    public void printStudentInfo1(Student st) {
        System.out.println("The Student doesn't have a course and avgGrade!");
        System.out.println("A Student: " + st.getName() + "; sex: " + st.getSex() + "; age: " + st.getAge());
    }

    public void printStudentInfo2(Student st) {
        System.out.println("The Student doesn't have a avgGrade!");
        System.out.println("A Student: " + st.getName() + "; sex: "
                + st.getSex() + "; age: " + st.getAge() + "; course: " + st.getCourse());
    }

    public void printStudentInfo3(Student st) {
        System.out.println("A Student: " + st.getName() + "; sex: " + st.getSex()
                + "; age: " + st.getAge()+ "; course: " + st.getCourse() + "; avgGrade: " + st.getAvgGrade());
    }

    public void printStudentsOverGrade(ArrayList<Student> list, double avgGrade) {
        for (Student st : list) {
            if (st.getAvgGrade() != 0 && st.getAvgGrade() > avgGrade) {
                printStudentInfo3(st);
            }
        }
    }

    public void printStudentsUnderGrade(ArrayList<Student> list, int avgGrade) {
        for (Student st : list) {
            if (st.getAvgGrade() != 0 && st.getAvgGrade() < avgGrade) {
                printStudentInfo3(st);
            }
        }
    }

    public void printStudentsOverAge(ArrayList<Student> list, int age) {
        for (Student st : list) {
            if (st.getAvgGrade() != 0 && st.getAge() > age) {
                printStudentInfo3(st);
            } else if (st.getCourse() != 0 && st.getAge() > age) {
                printStudentInfo2(st);
            } else {
                printStudentInfo1(st);
            }
        }
    }

    public void printStudentsUnderAge(ArrayList<Student> list, int age) {
        for (Student st : list) {
            if (st.getAvgGrade() != 0 && st.getAge() < age) {
                printStudentInfo3(st);
            } else if (st.getCourse() != 0 && st.getAge() < age) {
                printStudentInfo2(st);
            } else {
                printStudentInfo1(st);
            }
        }
    }

    public void printStudentsBySex(ArrayList<Student> list, char sex) {
        for (Student st : list) {
            if (st.getAvgGrade() != 0 && st.getSex() == sex) {
                printStudentInfo3(st);
            } else if (st.getCourse() != 0 && st.getSex() == sex) {
                printStudentInfo2(st);
            } else if (st.getSex() == sex) {
                printStudentInfo1(st);
            }
        }
    }



}






























