package StepikJava.ZaurJava.Lesson31.OtherTasks;

import java.util.Scanner;


public class ComputeLoan {
    public static void main(String[] args) {
        final int MONTHS_PER_YEAR = 12; // 12 месяцев

        double annualInterestRate; // годовая ставка в %
        int numberOfYears; // срок кредита в годах
        double loanAmount; // сумма кредита в рублях

        double monthlyInterestRate; // ежемесячная ставка в долях единицы
        double monthlyPayment; // ежемесячный платеж в рублях
        double totalPayment; // стоимость кредита в рублях

        Scanner scanner = new Scanner(System.in);

        // получить ежегодную ставку по кредиту в %
        System.out.println("Введите ежегодную ставку по кредиту в %, например, 8.25: ");
        annualInterestRate = scanner.nextDouble();

        // получить срок кредита в годах
        System.out.println("Введите срок кредита в годах, например, 5: ");
        numberOfYears = scanner.nextInt();

        // получить сумму кредита в рублях
        System.out.println("Введите сумму кредита в рублях, например, 120000.95: ");
        loanAmount = scanner.nextDouble();

        // вычислить ежемесячную ставку по кредиту в долях единицы
        monthlyInterestRate = annualInterestRate / 12 / 100;

        // вычислить ежемесячный платеж и стоимость кредита в рублях
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears
        * MONTHS_PER_YEAR));
        totalPayment = monthlyPayment * numberOfYears * MONTHS_PER_YEAR;

        // отобразить ежемесячный платеж и стоимость кредита в рублях,
        // округлив в пользу заемщика
        System.out.println("Ежемесячный платеж равен: " + (int)(monthlyPayment * 100) / 100.0 + " руб");
        System.out.println("Стоимость кредита равна " + (int)(totalPayment * 100) / 100.0 + " руб");
    }
}


























