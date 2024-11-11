package StepikJava.ZaurJava.Course1.Lesson29.Polymorphism1;

public class Teacher extends EmployeeNotAbstract implements Helpable {
    int countOfStudent;

//    @Override
//    public void work() {
//        System.out.println("Teacher works!");
//    }

    public void toTeach() {
        System.out.println("The Teacher is teaching!");
    }

    @Override
    public void help() {
        System.out.println("Teacher is helping!");
    }
}
