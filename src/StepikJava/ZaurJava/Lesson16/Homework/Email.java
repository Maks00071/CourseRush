package StepikJava.ZaurJava.Lesson16.Homework;

import java.util.Scanner;

public class Email {

    public static String checkEmail(String email) {
        return email.substring(email.indexOf('@') + 1, email.indexOf('.'));
    }

    public static void main(String[] args) {
        // "ya@yahoo.com;     on@mail.ru;        ona@gmail.com;"

        Scanner scanner = new Scanner(System.in);
        String emailInput = scanner.nextLine();

        int beginInd = 0;

        for (int i = 0; i < emailInput.length(); i++) {
            if (emailInput.charAt(i) == ';') {
                int endInd = i;
                System.out.println(Email.checkEmail(emailInput.substring(beginInd, endInd)));
                beginInd = endInd;
            }
        }

    }
}
