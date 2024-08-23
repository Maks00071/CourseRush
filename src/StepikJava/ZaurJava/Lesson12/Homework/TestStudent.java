package StepikJava.ZaurJava.Lesson12.Homework;

public class TestStudent {

    public static void compareStudentJustIf(Student std1, Student std2) {
        if (std1.getName().equals(std2.getName()) && std1.getCourse() == std2.getCourse() && std1.getGrade() == std2.getGrade()) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты разные");
        }
    }

    public static void compareStudentNestedIf(Student std1, Student std2) {
        if (std1.getName().equals(std2.getName())) {
            System.out.println("Имена студентов совпадают");

            if (std1.getCourse() == std2.getCourse()) {
                System.out.println("Студенты учатся на одном курсе");

                if (std1.getGrade() == std2.getGrade()) {
                    System.out.println("Оценки студентов одинаковые");
                } else {
                    System.out.println("Оценки студентов разные!");
                }
            } else {
                System.out.println("Студенты учатся на разных курсах!");
            }
        } else {
            System.out.println("Студенты имеют разные имена");
        }
    }

    public static void main(String[] args) {
        Student std1 = new Student("Ivan", 4, 7.89);
        Student std2 = new Student("Petr", 2, 8.97);
        Student std3 = new Student("Ivan", 3, 7.89);

        compareStudentJustIf(std1, std3);
        System.out.println("----------------------------------");
        compareStudentNestedIf(std1, std3);
    }
}



























