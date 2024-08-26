package StepikJava.ZaurJava.Lesson13.Homework;

public class Months {

    public int countDaysOfMonths(int numberOfMonths) {

        return switch (numberOfMonths) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("Введите число от 1 до 12!");
                yield -1;
            }
        };

    }

}
