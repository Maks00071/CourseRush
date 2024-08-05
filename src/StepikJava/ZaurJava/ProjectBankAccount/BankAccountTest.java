package StepikJava.ZaurJava.ProjectBankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, "Ivan", "Ivanov", 100.56);
        BankAccount account2 = new BankAccount(2, "Sveta", "Sidorova", 39.78);

        System.out.println(account1.toString());
        System.out.println("-----------------------------");
        System.out.println(account2.toString());

        System.out.println("=============================");

        System.out.println("Уменьшим баланс аккаунта c ID = " + account1.getId() + " на $50.56");
        account1.accountReduction(50.56);
        System.out.println(account1.toString());
    }
}
