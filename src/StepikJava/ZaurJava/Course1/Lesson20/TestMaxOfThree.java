package StepikJava.ZaurJava.Course1.Lesson20;

import java.util.Scanner;

public class TestMaxOfThree {
    public static void main(String[] args) {
        int x1, x2, x3;
        String result = "";

        int[] inputValues = readInput();
        x1 = inputValues[0];
        x2 = inputValues[1];
        x3 = inputValues[2];

        result = String.format("минимальное: %d, максимальное: %d", getMinOfThree(x1, x2, x3), getMaxOfThree(x1, x2, x3));
        System.out.println(result);
    }

    public static int[] readInput() {
        Scanner scanner = new Scanner(System.in);
        int[] inputValues = new int[3];

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");

            for (int i = 0; i < values.length; i++) {
                inputValues[i] = Integer.parseInt(values[i]);
            }
        }
        scanner.close();

        return inputValues;
    }

    public static int getMaxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int getMinOfThree(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}


















