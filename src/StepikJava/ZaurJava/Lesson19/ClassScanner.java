package StepikJava.ZaurJava.Lesson19;

import java.util.Scanner;

public class ClassScanner {
    public static void main(String[] args) {
        int x, y;

        int[] inputValues = readInput();

        x = inputValues[0];
        y = inputValues[1];

        int result = x + y;
        System.out.println(result);
    }


    public static int[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        String[] values = inputLine.split(" ");
        int[] result = new int[2];

        result[0] = Integer.parseInt(values[0]);
        result[1] = Integer.parseInt(values[1]);

        return result;
    }
}
