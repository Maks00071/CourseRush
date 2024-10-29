package StepikJava.ZaurJava.Lesson30.OtherTasks;

import java.util.Scanner;


public class AtmMachine {
    public static void main(String[] args) {
        int  amount; // сумма в рублях
        int numberOf5000Rub;    // кол-во купюр 5 тыс. руб
        int numberOf2000Rub;    // кол-во купюр 2 тыс. руб
        int numberOf1000Rub;    // кол-во купюр 1 тыс. руб
        int numberOf500Rub;     // кол-во купюр 500 руб
        int numberOf200Rub;     // кол-во купюр 200 руб
        int numberOf100Rub;     // кол-во купюр 100 руб
        int numberOf50Rub;      // кол-во купюр 50 руб

        Scanner scanner = new Scanner(System.in);

        // получаем сумму в рублях
        System.out.println("Введите сумму в рублях, кратную 50: ");
        amount = scanner.nextInt();

        // вычисляем кол-во купюр 5-тыс и обновляем оставшуюся сумму
        numberOf5000Rub = amount / 5000;
        amount %= 5000;

        // вычисляем кол-во купюр 2-тыс и обновляем оставшуюся сумму
        numberOf2000Rub = amount / 2000;
        amount %= 2000;

        // вычисляем кол-во купюр 1-тыс и обновляем оставшуюся сумму
        numberOf1000Rub = amount / 1000;
        amount %= 1000;

        // вычисляем кол-во купюр 500 руб и обновляем оставшуюся сумму
        numberOf500Rub = amount / 500;
        amount %= 500;

        // вычисляем кол-во купюр 200 руб и обновляем оставшуюся сумму
        numberOf200Rub = amount / 200;
        amount %= 200;

        // вычисляем кол-во купюр 100 руб и обновляем оставшуюся сумму
        numberOf100Rub = amount / 100;
        amount %= 100;

        // вычисляем кол-во купюр 50 руб и обновляем оставшуюся сумму
        numberOf50Rub = amount / 50;
        amount %= 50;

        // отобразим кол-во купюр каждого номинала
        System.out.println("Ваша сумма состоит из");
        System.out.println("    " + numberOf5000Rub + " шт 5-тыс купюр");
        System.out.println("    " + numberOf2000Rub + " шт 2-тыс купюр");
        System.out.println("    " + numberOf1000Rub + " шт 1-тыс купюр");
        System.out.println("    " + numberOf500Rub + " шт 500-руб купюр");
        System.out.println("    " + numberOf200Rub + " шт 200-руб купюр");
        System.out.println("    " + numberOf100Rub + " шт 100-руб купюр");
        System.out.println("    " + numberOf50Rub + " шт 50-руб купюр");
    }
}

















