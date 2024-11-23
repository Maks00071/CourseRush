package Tasks;

import java.util.Scanner;

public class getNewPosition {
    public static void main(String[] args) {

        int x, y;
        String direction, result = "";

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        y = Integer.parseInt(inputValues[1]);
        direction = inputValues[2];

        getDirection(x, y, direction);
    }

    public static String[] readInput() {

        String[] inputValues = new String[3];
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");

            for (int i = 0; i < values.length; i++) {
                inputValues[i] = values[i];
            }
        }
        scanner.close();

        return inputValues;
    }

    public static void getDirection(int x, int y, String direction) {

        switch (direction) {
            case "up" -> System.out.println("x: " + x +
                    ", y: " + (y - 1) + ", direction: " + direction);
            case "down" -> System.out.println("x: " + x +
                    ", y: " + (y + 1) + ", direction: " + direction);
            case "left" -> System.out.println("x: " + (x - 1) +
                    ", y: " + y + ", direction: " + direction);
            case "right" -> System.out.println("x: " + (x + 1) +
                    ", y: " + y + ", direction " + direction);
            default -> System.out.println("Error!");
        }

    }

}




















