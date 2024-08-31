package StepikJava.ZaurJava.Lesson15.CycleWhile;

import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean b = true;

        while(b) {
            int a = scanner.nextInt();

            if (a % 3 == 0 && a % 7 == 0) {
                System.out.println("The number found. This is " + a);
                b = false;
            }
        }
    }
}
