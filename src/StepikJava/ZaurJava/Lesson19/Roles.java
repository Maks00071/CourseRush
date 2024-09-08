package StepikJava.ZaurJava.Lesson19;

import java.util.Scanner;

public class Roles {
    public static void main(String[] args) {
        /*
            1 — admin
            2 — moderator
            3 — user
            default — guest
         */
        int role = readInput();
        String result = "";

        result = switch (role) {
                    case 1 -> "admin";
                    case 2 -> "moderator";
                    case 3 -> "user";
                    default -> "guest";
                };
        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);

        int role = 0;
        if (scanner.hasNextLine()) {
            role = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return role;
    }
}

















