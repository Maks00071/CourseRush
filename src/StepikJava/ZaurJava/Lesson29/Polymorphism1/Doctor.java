package StepikJava.ZaurJava.Lesson29.Polymorphism1;

public class Doctor extends EmployeeNotAbstract implements Helpable {
    String specialization;

//    @Override
//    public void work() {
//        System.out.println("Doctor works!");
//    }

    public void toHeal() {
        System.out.println("The Doctor is healing!");
    }

    @Override
    public void help() {
        System.out.println("Doctor is helping!");
    }

}
