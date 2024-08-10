package StepikJava.ZaurJava.ProjectEmployee;

import StepikJava.ZaurJava.ProjectBankAccount.BankAccount;

import StepikJava.ZaurJava.ProjectBankAccount.BankAccount;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Petr Petrov", 35, 2588.56);
        Employee employee2 = new Employee(2, "Ivan Ivanov", 49, 3459.89);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println("Увеличим работникам зарплату в 2 раза!");
        employee1.increaseSalary();
        employee2.increaseSalary();
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        BankAccount bankAccount = new BankAccount(3, "Maks", "Korystov");
        bankAccount.setBalance(6568.45);
        System.out.println("The Balance of " + bankAccount.getFirstName() + " " +
                bankAccount.getLastName() + " = $" + bankAccount.getBalance());
    }
}
