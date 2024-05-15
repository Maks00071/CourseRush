package Tasks;

/*
В классе Solution есть поле balance, которое описывает баланс средств на банковском счете.
При объявлении проинициализируй его значением Integer.MAX_VALUE.
Реализуй метод processPayment(String), который принимает чек и производит списание средств
со счета соответственно чеку.
Метод main не принимает участие в проверке.

Требования:
•	Поле balance должно инициализироваться при объявлении значением Integer.MAX_VALUE.
•	Метод processPayment(String) должен уменьшать поле balance на значение переданного аргумента.
*/

public class TaskBalance {
    private static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill ="1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        balance -= Integer.parseInt(bill);
    }
}





















