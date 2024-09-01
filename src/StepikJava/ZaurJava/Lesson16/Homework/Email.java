package StepikJava.ZaurJava.Lesson16.Homework;

import java.util.Scanner;

public class Email {

    public static String checkEmail(String email) {
        return email.substring(email.indexOf('@') + 1, email.indexOf('.'));
    }

    public static void main(String[] args) {
        // "ya@yahoo.com;" --> "yahoo"
        // "on@mail.ru;"   --> "mail"
        // "ona@gmail.com" --> "gmail"

        Scanner scanner = new Scanner(System.in);
        String emailInput = scanner.nextLine();
        String newEmail = Email.checkEmail(emailInput);
        System.out.println(newEmail);
    }
}
