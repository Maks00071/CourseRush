package StepikJava.ZaurJava.Lesson20;

public class CycleForeach {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filisifia"};

        for(String student: students) {
            for(String exam: exams) {
                System.out.println(student + " " + exam);
            }
        }
    }
}












































