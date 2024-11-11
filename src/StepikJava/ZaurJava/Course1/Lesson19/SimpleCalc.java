package StepikJava.ZaurJava.Course1.Lesson19;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        int x, y;
        String op;
        int result;

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        op = inputValues[1];
        y = Integer.parseInt(inputValues[2]);

        result = getCalc(x, y, op);
        System.out.println(result);
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            inputValues = input.split(" ");
        }
        scanner.close();

        return inputValues;
    }

    public static int getCalc(int x, int y, String operation) {
        if (operation.equals("+")) {
            return x + y;
        } else if (operation.equals("-")) {
            return x - y;
        } else if (operation.equals("/")) {
            return x / y;
        } else if (operation.equals("*")) {
            return x * y;
        } else {
            System.out.println("Введите верный арифметический оператор!");
            return -1;
        }
    }
}




















